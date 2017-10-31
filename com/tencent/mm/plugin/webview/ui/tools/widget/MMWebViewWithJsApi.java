package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.l;
import com.tencent.xweb.n;

public class MMWebViewWithJsApi
  extends MMWebView
{
  private c sCd;
  public boolean sCe;
  
  public MMWebViewWithJsApi(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(12066576400384L, 89903);
    GMTrace.o(12066576400384L, 89903);
  }
  
  public MMWebViewWithJsApi(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12066710618112L, 89904);
    GMTrace.o(12066710618112L, 89904);
  }
  
  public MMWebViewWithJsApi(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12066844835840L, 89905);
    this.sCe = true;
    cgi();
    getSettings().setJavaScriptEnabled(true);
    getSettings().coT();
    setWebChromeClient(new b(this));
    setWebViewClient(new c(this));
    paramContext = getSettings().getUserAgentString();
    if (!s.OQ(paramContext))
    {
      paramContext = s.aY(getContext(), paramContext);
      getSettings().setUserAgentString(paramContext);
    }
    GMTrace.o(12066844835840L, 89905);
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12067247489024L, 89908);
    if (this.sCd != null) {
      this.sCd.sBV = true;
    }
    super.loadData(paramString1, paramString2, paramString3);
    GMTrace.o(12067247489024L, 89908);
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    GMTrace.i(12067381706752L, 89909);
    if (this.sCd != null) {
      this.sCd.sBV = true;
    }
    super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    GMTrace.o(12067381706752L, 89909);
  }
  
  protected void onDetachedFromWindow()
  {
    GMTrace.i(12067113271296L, 89907);
    super.onDetachedFromWindow();
    if ((this.sCd != null) && (this.sCe)) {
      this.sCd.cleanup();
    }
    GMTrace.o(12067113271296L, 89907);
  }
  
  public void setWebViewClient(n paramn)
  {
    GMTrace.i(19458886205440L, 144980);
    super.setWebViewClient(paramn);
    if ((paramn instanceof c)) {
      this.sCd = ((c)paramn);
    }
    GMTrace.o(19458886205440L, 144980);
  }
  
  public static final class a
  {
    public static MMWebViewWithJsApi dv(Context paramContext)
    {
      GMTrace.i(15300284121088L, 113996);
      MMWebViewWithJsApi.dt(paramContext);
      paramContext = new MMWebViewWithJsApi(paramContext);
      MMWebViewWithJsApi.a(paramContext);
      GMTrace.o(15300284121088L, 113996);
      return paramContext;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithJsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */