import { useEffect, useState } from "react";
import type { ChangeEvent } from "react";
import axios from "axios";
import "./App.css";

type Greeting = {
    lang: string;
    name: string;
};

type OptionsResponse = Record<string, string>;

type GreetingResponse = string;

function App() {
    const [greetingList, setGreetingList] = useState<Greeting[]>([
        { lang: "", name: "--言語を選択してください--" },
    ]);

    const [select, setSelect] = useState<string>("");
    const [text, setText] = useState<string>("");

    // 🔹 options取得
    useEffect(() => {
        const fetchOptions = async () => {
            try {
                const res = await axios.get<OptionsResponse>("/api/options");

                const options: Greeting[] = Object.entries(res.data).map(
                    ([lang, name]) => ({
                        lang,
                        name,
                    }),
                );

                setGreetingList([
                    { lang: "", name: "--言語を選択してください--" },
                    ...options,
                ]);
            } catch (error) {
                console.error("options取得失敗", error);
            }
        };

        fetchOptions();
    }, []);

    // 🔹 select変更
    const changeSelect = (e: ChangeEvent<HTMLSelectElement>) => {
        setSelect(e.target.value);
    };

    // 🔹 greeting取得
    useEffect(() => {
        const fetchGreeting = async () => {
            if (!select) {
                setText("");
                return;
            }

            try {
                const res = await axios.get<GreetingResponse>(
                    `/api/greeting?lang=${select}`,
                );
                setText(res.data);
            } catch (error) {
                console.error("greeting取得失敗", error);
                setText("エラーが発生しました");
            }
        };

        fetchGreeting();
    }, [select]);

    return (
        <div>
            <h1>言語を選択してください</h1>

            <select
                className="selectBox"
                value={select}
                onChange={changeSelect}>
                {greetingList.map((value) => (
                    <option key={value.lang} value={value.lang}>
                        {value.name}
                    </option>
                ))}
            </select>

            <p>{text}</p>
        </div>
    );
}

export default App;
