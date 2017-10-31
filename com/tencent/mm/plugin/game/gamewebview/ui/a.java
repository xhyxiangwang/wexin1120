package com.tencent.mm.plugin.game.gamewebview.ui;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.v;

public final class a
{
  private String lang;
  boolean mwn;
  private String mwo;
  private String mwp;
  private String mwq;
  private String mwr;
  private String mws;
  private String mwt;
  
  public a(Bundle paramBundle)
  {
    GMTrace.i(16991159058432L, 126594);
    this.mwn = paramBundle.getBoolean("close_window_confirm_dialog_switch");
    this.mwo = paramBundle.getString("close_window_confirm_dialog_title_cn");
    this.mwp = paramBundle.getString("close_window_confirm_dialog_title_eng");
    this.mwq = paramBundle.getString("close_window_confirm_dialog_ok_cn");
    this.mwr = paramBundle.getString("close_window_confirm_dialog_ok_eng");
    this.mws = paramBundle.getString("close_window_confirm_dialog_cancel_cn");
    this.mwt = paramBundle.getString("close_window_confirm_dialog_cancel_eng");
    this.lang = v.eq(ab.getContext());
    GMTrace.o(16991159058432L, 126594);
  }
  
  public final String aCV()
  {
    GMTrace.i(16991293276160L, 126595);
    if ("zh_CN".equals(this.lang))
    {
      str = this.mwo;
      GMTrace.o(16991293276160L, 126595);
      return str;
    }
    String str = this.mwp;
    GMTrace.o(16991293276160L, 126595);
    return str;
  }
  
  public final String aCW()
  {
    GMTrace.i(16991427493888L, 126596);
    if ("zh_CN".equals(this.lang))
    {
      str = this.mwq;
      GMTrace.o(16991427493888L, 126596);
      return str;
    }
    String str = this.mwr;
    GMTrace.o(16991427493888L, 126596);
    return str;
  }
  
  public final String aCX()
  {
    GMTrace.i(16991561711616L, 126597);
    if ("zh_CN".equals(this.lang))
    {
      str = this.mws;
      GMTrace.o(16991561711616L, 126597);
      return str;
    }
    String str = this.mwt;
    GMTrace.o(16991561711616L, 126597);
    return str;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */