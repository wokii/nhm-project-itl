package ic.ac.uk.itl.web;

import org.eclipse.xtend.lib.annotations.Data;
import org.eclipse.xtext.web.server.IServiceResult;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@Data
@SuppressWarnings("all")
public class RunResult implements IServiceResult {
  private final String result;
  
  public RunResult(final String result) {
    super();
    this.result = result;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.result== null) ? 0 : this.result.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    RunResult other = (RunResult) obj;
    if (this.result == null) {
      if (other.result != null)
        return false;
    } else if (!this.result.equals(other.result))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("result", this.result);
    return b.toString();
  }
  
  @Pure
  public String getResult() {
    return this.result;
  }
}
