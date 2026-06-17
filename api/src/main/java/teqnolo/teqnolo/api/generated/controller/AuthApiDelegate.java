package teqnolo.teqnolo.api.generated.controller;

import teqnolo.teqnolo.api.generated.model.LoginWithPassword401Response;
import teqnolo.teqnolo.api.generated.model.LoginWithPasswordRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link AuthApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public interface AuthApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /auth/login : ログイン (パスワード)
     * ユーザー名とパスワードを使ってアプリにログインする。 セッション固定化攻撃対策のため、**セッションIDは新しく生成し直す**こと  (&#x60;sessionFixation().migrateSession()&#x60;)。
     *
     * @param loginWithPasswordRequest パスワードを使ってシステムにログインする (required)
     * @return ログインに成功したら、ユーザ名に関連付けられたセッションを払い出す (status code 200)
     *         or ユーザー名またはパスワードが異なる。あるいはアカウントがロックアウトされているなどでログインに失敗した。 (status code 401)
     * @see AuthApi#loginWithPassword
     */
    default ResponseEntity<Void> loginWithPassword(LoginWithPasswordRequest loginWithPasswordRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/problem+json"))) {
                    String exampleString = "Custom MIME type example not yet supported: application/problem+json";
                    ApiUtil.setExampleResponse(request, "application/problem+json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /auth/logout : ログアウト
     * Cookie で指定されたセッションを無効化してログアウトする
     *
     * @return ログアウトに成功した (status code 204)
     * @see AuthApi#logout
     */
    default ResponseEntity<Void> logout() {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
