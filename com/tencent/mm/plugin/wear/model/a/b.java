package com.tencent.mm.plugin.wear.model.a;

import android.net.Uri;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.Asset;
import com.tencent.gmtrace.GMTrace;
import java.util.HashSet;

public abstract interface b
{
  public abstract byte[] a(Asset paramAsset);
  
  public abstract boolean bzA();
  
  public abstract void bzB();
  
  public abstract void bzx();
  
  public abstract c bzy();
  
  public abstract HashSet<String> bzz();
  
  public abstract void finish();
  
  public abstract boolean g(Uri paramUri);
  
  public abstract boolean isAvailable();
  
  public abstract a s(String paramString, byte[] paramArrayOfByte);
  
  public abstract a t(String paramString, byte[] paramArrayOfByte);
  
  public static final class a
  {
    public int code;
    public String ftU;
    
    a()
    {
      GMTrace.i(9210154713088L, 68621);
      this.code = 0;
      GMTrace.o(9210154713088L, 68621);
    }
    
    a(byte paramByte)
    {
      GMTrace.i(9210288930816L, 68622);
      this.code = 0;
      this.code = 131072;
      GMTrace.o(9210288930816L, 68622);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */