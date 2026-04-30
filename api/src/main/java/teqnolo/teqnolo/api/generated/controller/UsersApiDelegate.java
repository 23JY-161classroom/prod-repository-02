package teqnolo.teqnolo.api.generated.controller;

import teqnolo.teqnolo.api.generated.model.ChangeEmailRequest;
import teqnolo.teqnolo.api.generated.model.ChangePasswordRequest;
import teqnolo.teqnolo.api.generated.model.CheckUserAvailability200Response;
import teqnolo.teqnolo.api.generated.model.CheckUserAvailabilityRequest;
import teqnolo.teqnolo.api.generated.model.DeleteUserRequest;
import teqnolo.teqnolo.api.generated.model.FindSelf200Response;
import teqnolo.teqnolo.api.generated.model.LoginWithPassword401Response;
import org.springframework.lang.Nullable;
import teqnolo.teqnolo.api.generated.model.RegisterUserRequest;
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
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-19T17:50:12.030732900+09:00[Asia/Tokyo]", comments = "Generator version: 7.21.0")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users/me/email : メールアドレス変更
     * 認証済みのユーザーがメールアドレスを変更する。再認証及びメールアドレスの到達確認が必要。
     *
     * @param changeEmailRequest 新しく設定するメールアドレス (optional)
     * @return 確認メールの送信に成功した (メールアドレスの変更自体は未完了) (status code 204)
     *         or 再認証に失敗した (status code 401)
     *         or 新しいメールアドレスが既に登録されている (status code 409)
     * @see UsersApi#changeEmail
     */
    default ResponseEntity<Void> changeEmail(ChangeEmailRequest changeEmailRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /users/me/password : パスワード変更
     * 認証済みのユーザーがパスワードを再設定する。再認証が必要。
     *
     * @param changePasswordRequest 現在のパスワードと、新しく設定するパスワード (optional)
     * @return パスワードの変更に成功した (status code 204)
     *         or 現在のパスワードが間違っている、またはロックアウトによって、再設定に失敗した (status code 401)
     *         or パスワードの形式が異なる (status code 422)
     * @see UsersApi#changePassword
     */
    default ResponseEntity<Void> changePassword(ChangePasswordRequest changePasswordRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /users/availability : ユーザー識別子の有効性チェック
     * ユーザー名やメールアドレスに重複がないか確認する
     *
     * @param checkUserAvailabilityRequest  (required)
     * @return ユーザーIDの重複チェックの結果 (status code 200)
     *         or 未認証の状態で context&#x3D;update を呼び出した。（※特にこの挙動にリスクはなさそうだが、仕様外の呼び出しにはエラーで対応するべきか） (status code 401)
     *         or ユーザーIDのチェック以前に、バリデーションに引っかかった (status code 422)
     * @see UsersApi#checkUserAvailability
     */
    default ResponseEntity<CheckUserAvailability200Response> checkUserAvailability(CheckUserAvailabilityRequest checkUserAvailabilityRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"email\" : { \"available\" : true }, \"username\" : { \"available\" : true } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /users/me : 退会
     * ユーザーを削除する。再認証が必要。
     *
     * @param deleteUserRequest 再認証用のパスワードを指定する (optional)
     * @return ユーザーの削除に成功した (status code 204)
     *         or 現在のパスワードが間違っている、またはロックアウトによって、再設定に失敗した (status code 401)
     * @see UsersApi#deleteUser
     */
    default ResponseEntity<Void> deleteUser(DeleteUserRequest deleteUserRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /users/me : 自分の情報取得
     * 自分のユーザー情報を取得する
     *
     * @return 自身のユーザー情報 (status code 200)
     *         or 未認証の状態でアクセスした (status code 401)
     * @see UsersApi#findSelf
     */
    default ResponseEntity<FindSelf200Response> findSelf() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"email\" : \"taroden@example.com\", \"username\" : \"taroden\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"email\" : \"taroden@example.com\", \"username\" : \"taroden\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /users : ユーザ登録
     * ユーザー登録を行う。この際、詳細なプロフィール情報は入力項目に含めない。なお、この段階ではメールアドレス未認証のため、有効化されていないことに注意
     *
     * @param registerUserRequest パスワードやユーザ名などのユーザー登録に必要な情報を指定する。 (optional)
     * @return ユーザー登録に成功したら、新しいユーザー名を返す (status code 204)
     *         or メールアドレスやユーザー名が重複している (status code 409)
     *         or 仕様上不正な形式でログインが行われた (status code 422)
     * @see UsersApi#registerUser
     */
    default ResponseEntity<Void> registerUser(RegisterUserRequest registerUserRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"instance\" : \"instance\", \"code\" : \"code\", \"detail\" : \"detail\", \"type\" : \"https://openapi-generator.tech\", \"title\" : \"title\", \"errors\" : [ { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" }, { \"pointer\" : \"pointer\", \"code\" : \"code\", \"parameter\" : \"parameter\", \"header\" : \"header\", \"detail\" : \"detail\" } ], \"status\" : 139 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /users/verify-email : メールアドレス認証
     * 登録したメールアドレスに送られたマジックリンクを踏むと、メールアドレスの認証に成功する
     *
     * @param token メールアドレス認証に用いる十分にランダムなトークン (required)
     * @return メールアドレス認証完了画面 / エラー画面にリダイレクトする (status code 302)
     * @see UsersApi#verifyEmail
     */
    default ResponseEntity<Void> verifyEmail(String token) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
