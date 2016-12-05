package your.pkg.id;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.HashMap;
import java.util.Map;

public class YourLibNameHereModule extends ReactContextBaseJavaModule {

  public YourLibNameHereModule(ReactApplicationContext rctx) {
    super(rctx);
  }

  @Override
  public String getName() {
    return "YourLibNameHere";
  }

  @Override
  public Map<String, Object> getConstants() {
      return new HashMap<>();
  }
}
