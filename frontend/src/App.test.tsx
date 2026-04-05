import { describe, it, expect, vi, beforeEach } from "vitest";
import { render, screen, waitFor, fireEvent } from "@testing-library/react";
import "@testing-library/jest-dom";
import axios from "axios";
import App from "./App";

vi.mock("axios");

const mockedAxios = axios as unknown as {
    get: ReturnType<typeof vi.fn>;
};

describe("App", () => {
    beforeEach(() => {
        vi.clearAllMocks();
    });

    it("初期表示が正しい", async () => {
        mockedAxios.get.mockResolvedValueOnce({
            data: {},
        });

        render(<App />);

        expect(screen.getByText("言語を選択してください")).toBeInTheDocument();
    });

    it("APIからoptionsを取得してselectに表示する", async () => {
        mockedAxios.get.mockResolvedValueOnce({
            data: {
                en: "English",
                ja: "Japanese",
            },
        });

        render(<App />);

        await waitFor(() => {
            expect(screen.getByText("English")).toBeInTheDocument();
            expect(screen.getByText("Japanese")).toBeInTheDocument();
        });
    });

    it("select変更でgreetingを取得して表示する", async () => {
        // 1回目 → options取得
        mockedAxios.get.mockResolvedValueOnce({
            data: {
                en: "English",
            },
        });

        // 2回目 → greeting取得
        mockedAxios.get.mockResolvedValueOnce({
            data: "Hello",
        });

        render(<App />);

        // options表示待ち
        await waitFor(() => {
            expect(screen.getByText("English")).toBeInTheDocument();
        });

        const select = screen.getByRole("combobox");

        fireEvent.change(select, { target: { value: "en" } });

        await waitFor(() => {
            expect(screen.getByText("Hello")).toBeInTheDocument();
        });
    });
});
