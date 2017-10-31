package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList;

public class WebBackForwardList
{
  private IX5WebBackForwardList xyD = null;
  private android.webkit.WebBackForwardList xyE = null;
  
  static WebBackForwardList a(android.webkit.WebBackForwardList paramWebBackForwardList)
  {
    if (paramWebBackForwardList == null) {
      return null;
    }
    WebBackForwardList localWebBackForwardList = new WebBackForwardList();
    localWebBackForwardList.xyE = paramWebBackForwardList;
    return localWebBackForwardList;
  }
  
  static WebBackForwardList a(IX5WebBackForwardList paramIX5WebBackForwardList)
  {
    if (paramIX5WebBackForwardList == null) {
      return null;
    }
    WebBackForwardList localWebBackForwardList = new WebBackForwardList();
    localWebBackForwardList.xyD = paramIX5WebBackForwardList;
    return localWebBackForwardList;
  }
  
  public int getCurrentIndex()
  {
    if (this.xyD != null) {
      return this.xyD.getCurrentIndex();
    }
    return this.xyE.getCurrentIndex();
  }
  
  public WebHistoryItem getCurrentItem()
  {
    if (this.xyD != null) {
      return WebHistoryItem.a(this.xyD.getCurrentItem());
    }
    return WebHistoryItem.a(this.xyE.getCurrentItem());
  }
  
  public WebHistoryItem getItemAtIndex(int paramInt)
  {
    if (this.xyD != null) {
      return WebHistoryItem.a(this.xyD.getItemAtIndex(paramInt));
    }
    return WebHistoryItem.a(this.xyE.getItemAtIndex(paramInt));
  }
  
  public int getSize()
  {
    if (this.xyD != null) {
      return this.xyD.getSize();
    }
    return this.xyE.getSize();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/WebBackForwardList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */