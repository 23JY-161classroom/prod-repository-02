package teqnolo.teqnolo.api.users;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import teqnolo.teqnolo.api.generated.controller.UsersApiDelegate;
import teqnolo.teqnolo.api.generated.model.FindSelf200Response;

@Component
public class UsersApiDelegateImpl implements UsersApiDelegate {


    @Override
    public ResponseEntity<FindSelf200Response> findSelf() {
        // TODO: UserServiceから、現在のユーザーの情報を取得し、responseにセットするロジックを実装する
        FindSelf200Response response = new FindSelf200Response().email("user@example.com").username("user");
        return ResponseEntity.ok(response);
    }
}
