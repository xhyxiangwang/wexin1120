package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.i;
import com.tencent.mm.sdk.platformtools.ab;

public class FTSSearchTabWebViewUI
  extends FTSBaseWebViewUI
{
  public FTSSearchTabWebViewUI()
  {
    GMTrace.i(12311792189440L, 91730);
    GMTrace.o(12311792189440L, 91730);
  }
  
  protected final String getHint()
  {
    GMTrace.i(12311926407168L, 91731);
    String str = getIntent().getStringExtra("key_search_input_hint");
    if (!TextUtils.isEmpty(str))
    {
      GMTrace.o(12311926407168L, 91731);
      return str;
    }
    int i = -1;
    switch (this.type)
    {
    }
    while (i < 0)
    {
      str = ab.getContext().getResources().getString(R.l.dwX);
      GMTrace.o(12311926407168L, 91731);
      return str;
      i = R.l.eEz;
      continue;
      i = R.l.ebK;
      continue;
      i = R.l.eEy;
      continue;
      i = R.l.ebJ;
      continue;
      i = R.l.duy;
      continue;
      i = R.l.ebF;
      continue;
      i = R.l.ebG;
      continue;
      i = R.l.ebH;
      continue;
      i = R.l.ebI;
    }
    str = ab.getContext().getResources().getString(R.l.eEx, new Object[] { ab.getContext().getResources().getString(i) });
    GMTrace.o(12311926407168L, 91731);
    return str;
  }
  
  protected void onPause()
  {
    GMTrace.i(12312194842624L, 91733);
    super.onPause();
    i.Kx();
    GMTrace.o(12312194842624L, 91733);
  }
  
  protected void onResume()
  {
    GMTrace.i(12312060624896L, 91732);
    super.onResume();
    i.Kw();
    GMTrace.o(12312060624896L, 91732);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSSearchTabWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */