package com.tencent.mm.plugin.setting.ui.setting;

import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;

final class b
{
  LinearLayout puJ;
  LinearLayout puK;
  LinearLayout puL;
  LinearLayout puM;
  LinearLayout puN;
  
  b()
  {
    GMTrace.i(4620445286400L, 34425);
    GMTrace.o(4620445286400L, 34425);
  }
  
  public final void Fv(String paramString)
  {
    GMTrace.i(4620579504128L, 34426);
    if (paramString.equals("downloading"))
    {
      this.puJ.setVisibility(0);
      this.puK.setVisibility(8);
      this.puL.setVisibility(8);
      this.puM.setVisibility(8);
      this.puN.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("downloaded"))
    {
      this.puJ.setVisibility(8);
      this.puK.setVisibility(0);
      this.puL.setVisibility(8);
      this.puM.setVisibility(8);
      this.puN.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("undownloaded"))
    {
      this.puJ.setVisibility(8);
      this.puK.setVisibility(8);
      this.puL.setVisibility(0);
      this.puM.setVisibility(8);
      this.puN.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("using"))
    {
      this.puJ.setVisibility(8);
      this.puK.setVisibility(8);
      this.puL.setVisibility(8);
      this.puM.setVisibility(0);
      this.puN.setVisibility(8);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    if (paramString.equals("canceling"))
    {
      this.puJ.setVisibility(8);
      this.puK.setVisibility(8);
      this.puL.setVisibility(8);
      this.puM.setVisibility(8);
      this.puN.setVisibility(0);
      GMTrace.o(4620579504128L, 34426);
      return;
    }
    GMTrace.o(4620579504128L, 34426);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */