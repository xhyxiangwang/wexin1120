package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class v
  extends p
{
  public List<a> piV;
  public String qnO;
  public float qnP;
  public String qnQ;
  public int qnR;
  public int qnS;
  public int qnT;
  public int qnU;
  public String qnV;
  
  public v()
  {
    GMTrace.i(8207682502656L, 61152);
    this.qnO = "";
    this.qnQ = "";
    this.qnV = "";
    this.piV = new ArrayList();
    GMTrace.o(8207682502656L, 61152);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(8207816720384L, 61153);
    if (paramObject == this)
    {
      GMTrace.o(8207816720384L, 61153);
      return true;
    }
    if ((paramObject instanceof v))
    {
      paramObject = (v)paramObject;
      if (((v)paramObject).qnO == null)
      {
        if (this.qnO != null) {
          break label171;
        }
        if (((v)paramObject).qnP != this.qnP) {
          break label171;
        }
        if (((v)paramObject).qnQ != null) {
          break label181;
        }
        if (this.qnQ != null) {
          break label171;
        }
        if ((((v)paramObject).qnR != this.qnR) || (((v)paramObject).qnS != this.qnS) || (((v)paramObject).qnT != this.qnT) || (((v)paramObject).qnU != this.qnU)) {
          break label171;
        }
        if (((v)paramObject).piV != null) {
          break label198;
        }
        if (this.piV != null) {
          break label171;
        }
        label133:
        if (((v)paramObject).qnV != null) {
          break label217;
        }
        if (this.qnV != null) {
          break label171;
        }
      }
      for (;;)
      {
        GMTrace.o(8207816720384L, 61153);
        return true;
        if (((v)paramObject).qnO.equals(this.qnO)) {
          break;
        }
        label171:
        label181:
        label198:
        label217:
        do
        {
          do
          {
            do
            {
              GMTrace.o(8207816720384L, 61153);
              return false;
            } while (!((v)paramObject).qnQ.equals(this.qnQ));
            break;
          } while (!((v)paramObject).piV.equals(this.piV));
          break label133;
        } while (!((v)paramObject).qnV.equals(this.qnV));
      }
    }
    GMTrace.o(8207816720384L, 61153);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(8207950938112L, 61154);
    int i = super.hashCode();
    GMTrace.o(8207950938112L, 61154);
    return i;
  }
  
  public static final class a
  {
    public String label;
    public String qnW;
    public float value;
    
    public a()
    {
      GMTrace.i(8288750010368L, 61756);
      this.label = "";
      this.qnW = "";
      GMTrace.o(8288750010368L, 61756);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8288884228096L, 61757);
      if (paramObject == this)
      {
        GMTrace.o(8288884228096L, 61757);
        return true;
      }
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((((a)paramObject).label.equals(this.label)) && (((a)paramObject).qnW.equals(this.qnW)) && (((a)paramObject).value == this.value))
        {
          GMTrace.o(8288884228096L, 61757);
          return true;
        }
        GMTrace.o(8288884228096L, 61757);
        return false;
      }
      GMTrace.o(8288884228096L, 61757);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(8289018445824L, 61758);
      int i = (int)(this.label.hashCode() + this.qnW.hashCode() + this.value);
      GMTrace.o(8289018445824L, 61758);
      return i;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */