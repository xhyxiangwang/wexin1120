package com.tencent.mm.plugin.appbrand;

import android.webkit.ValueCallback;
import java.nio.ByteBuffer;

public abstract interface c
{
  public abstract int Ru();
  
  public abstract boolean Rv();
  
  public abstract void a(int paramInt, ByteBuffer paramByteBuffer);
  
  public abstract void cleanup();
  
  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);
  
  public abstract ByteBuffer hI(int paramInt);
  
  public abstract void pause();
  
  public abstract void resume();
  
  public abstract boolean wv();
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */