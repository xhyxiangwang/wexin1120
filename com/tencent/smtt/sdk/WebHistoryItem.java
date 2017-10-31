package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;

public class WebHistoryItem
{
  private IX5WebHistoryItem xyF = null;
  private android.webkit.WebHistoryItem xyG = null;
  
  static WebHistoryItem a(android.webkit.WebHistoryItem paramWebHistoryItem)
  {
    if (paramWebHistoryItem == null) {
      return null;
    }
    WebHistoryItem localWebHistoryItem = new WebHistoryItem();
    localWebHistoryItem.xyG = paramWebHistoryItem;
    return localWebHistoryItem;
  }
  
  static WebHistoryItem a(IX5WebHistoryItem paramIX5WebHistoryItem)
  {
    if (paramIX5WebHistoryItem == null) {
      return null;
    }
    WebHistoryItem localWebHistoryItem = new WebHistoryItem();
    localWebHistoryItem.xyF = paramIX5WebHistoryItem;
    return localWebHistoryItem;
  }
  
  public Bitmap getFavicon()
  {
    if (this.xyF != null) {
      return this.xyF.getFavicon();
    }
    return this.xyG.getFavicon();
  }
  
  public String getOriginalUrl()
  {
    if (this.xyF != null) {
      return this.xyF.getOriginalUrl();
    }
    return this.xyG.getOriginalUrl();
  }
  
  public String getTitle()
  {
    if (this.xyF != null) {
      return this.xyF.getTitle();
    }
    return this.xyG.getTitle();
  }
  
  public String getUrl()
  {
    if (this.xyF != null) {
      return this.xyF.getUrl();
    }
    return this.xyG.getUrl();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/smtt/sdk/WebHistoryItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */