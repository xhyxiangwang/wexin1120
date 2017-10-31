package com.tencent.mm.plugin.webview.ui.tools.fts;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.i;

public class FTSWebViewUI
  extends FTSBaseWebViewUI
{
  public FTSWebViewUI()
  {
    GMTrace.i(12304410214400L, 91675);
    GMTrace.o(12304410214400L, 91675);
  }
  
  protected final void aal()
  {
    GMTrace.i(12304678649856L, 91677);
    super.aal();
    i.gC(this.scene);
    GMTrace.o(12304678649856L, 91677);
  }
  
  protected final String getHint()
  {
    GMTrace.i(12304544432128L, 91676);
    String str = getString(R.l.dwX);
    GMTrace.o(12304544432128L, 91676);
    return str;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(12305081303040L, 91680);
    super.onDestroy();
    i.Ky();
    i.Kz();
    GMTrace.o(12305081303040L, 91680);
  }
  
  protected void onPause()
  {
    GMTrace.i(12304947085312L, 91679);
    super.onPause();
    i.Kx();
    GMTrace.o(12304947085312L, 91679);
  }
  
  protected void onResume()
  {
    GMTrace.i(12304812867584L, 91678);
    super.onResume();
    i.Kw();
    GMTrace.o(12304812867584L, 91678);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */