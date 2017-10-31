package com.tencent.mm.jsapi.b;

import android.webkit.ValueCallback;

public abstract interface e
{
  public abstract void cleanup();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract boolean wu();
  
  public abstract boolean wv();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/jsapi/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */