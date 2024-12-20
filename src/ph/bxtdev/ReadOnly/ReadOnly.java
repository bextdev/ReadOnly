package ph.bxtdev.ReadOnly;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.*;

public class ReadOnly extends AndroidNonvisibleComponent {

  public ReadOnly(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "Set an AndroidViewComponent to read-only")
  public void Enable(AndroidViewComponent component) {
    if (component instanceof TextBox) {
      ((TextBox) component).ReadOnly(true);
    } 
  }

  @SimpleFunction(description = "Set an AndroidViewComponent to editable (not read-only)")
  public void Disable(AndroidViewComponent component) {
    if (component instanceof TextBox) {
      ((TextBox) component).ReadOnly(false);
    } 
  }
}
