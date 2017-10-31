package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;

public final class e
{
  public String aDw;
  public String gbP;
  public b iDC;
  public String iDD;
  public a iDE;
  public a iDF;
  public a iDG;
  public String iDH;
  public String iDI;
  public String iDJ;
  public String iDK;
  public String iDL;
  public String iDM;
  public String iDN;
  public String iDO;
  public String iDP;
  public String title;
  public String url;
  
  public e()
  {
    GMTrace.i(15545097256960L, 115820);
    GMTrace.o(15545097256960L, 115820);
  }
  
  public static final class a
  {
    private String country;
    private String gbX;
    private String iDQ;
    public String iDR;
    private String state;
    
    public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    {
      GMTrace.i(15545768345600L, 115825);
      this.country = bg.mY(paramString1);
      this.state = bg.mY(paramString2);
      this.gbX = bg.mY(paramString3);
      this.iDQ = bg.mY(paramString4);
      this.iDR = bg.mY(paramString5);
      GMTrace.o(15545768345600L, 115825);
    }
    
    public final String KC()
    {
      GMTrace.i(15545902563328L, 115826);
      if ((bg.Rn(this.country)) || (bg.Rn(this.state)) || (bg.Rn(this.gbX)) || (bg.Rn(this.iDQ)) || (bg.Rn(this.iDR)))
      {
        localObject = new StringBuilder();
        if (this.country.length() > 0) {
          ((StringBuilder)localObject).append(this.country);
        }
        if (this.state.length() > 0) {
          ((StringBuilder)localObject).append(this.state);
        }
        if (this.gbX.length() > 0) {
          ((StringBuilder)localObject).append(this.gbX);
        }
        if (this.iDQ.length() > 0) {
          ((StringBuilder)localObject).append(this.iDQ);
        }
        if (this.iDR.length() > 0)
        {
          ((StringBuilder)localObject).append(" ");
          ((StringBuilder)localObject).append(this.iDR);
        }
        localObject = ((StringBuilder)localObject).toString();
        GMTrace.o(15545902563328L, 115826);
        return (String)localObject;
      }
      Object localObject = new StringBuilder();
      if (this.iDQ.length() > 0)
      {
        ((StringBuilder)localObject).append(this.iDQ);
        ((StringBuilder)localObject).append(" ");
      }
      if (this.gbX.length() > 0) {
        ((StringBuilder)localObject).append(this.gbX + " ");
      }
      if (this.state.length() > 0) {
        ((StringBuilder)localObject).append(this.state + " ");
      }
      if (this.country.length() > 0) {
        ((StringBuilder)localObject).append(this.country);
      }
      if (this.iDR.length() > 0)
      {
        ((StringBuilder)localObject).append(" ");
        ((StringBuilder)localObject).append(this.iDR);
      }
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(15545902563328L, 115826);
      return (String)localObject;
    }
  }
  
  public static final class b
  {
    public String iDS;
    public String iDT;
    public String iDU;
    
    public b(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(15545231474688L, 115821);
      this.iDS = bg.mY(paramString1);
      this.iDT = bg.mY(paramString2);
      this.iDU = bg.mY(paramString3);
      GMTrace.o(15545231474688L, 115821);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */