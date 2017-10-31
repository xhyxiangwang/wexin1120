package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;

public class FreeWifiMIGNoAuthStateUI
  extends FreeWifiNoAuthStateUI
{
  public FreeWifiMIGNoAuthStateUI()
  {
    GMTrace.i(7200915324928L, 53651);
    GMTrace.o(7200915324928L, 53651);
  }
  
  protected final String aAK()
  {
    GMTrace.i(7201049542656L, 53652);
    String str = getString(R.l.epc);
    GMTrace.o(7201049542656L, 53652);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiMIGNoAuthStateUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */