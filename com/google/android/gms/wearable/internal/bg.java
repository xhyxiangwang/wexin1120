package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c.a;
import com.google.android.gms.wearable.c.c;
import com.google.android.gms.wearable.c.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.h;
import java.io.IOException;
import java.io.InputStream;

public final class bg
  implements com.google.android.gms.wearable.c
{
  public final e<h> a(com.google.android.gms.common.api.c paramc)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public final e<c.d> a(com.google.android.gms.common.api.c paramc, final Asset paramAsset)
  {
    if (paramAsset == null) {
      throw new IllegalArgumentException("asset is null");
    }
    if (paramAsset.aAo == null) {
      throw new IllegalArgumentException("invalid asset");
    }
    if (paramAsset.aAn != null) {
      throw new IllegalArgumentException("invalid asset");
    }
    paramc.a(new aw(paramc) {});
  }
  
  public final e<c.a> a(com.google.android.gms.common.api.c paramc, final PutDataRequest paramPutDataRequest)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public final e<c.c> b(com.google.android.gms.common.api.c paramc, final Uri paramUri)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public static final class a
    implements c.a
  {
    private final f aCE;
    private final Status azY;
    
    public a(Status paramStatus, f paramf)
    {
      this.azY = paramStatus;
      this.aCE = paramf;
    }
    
    public final Status jW()
    {
      return this.azY;
    }
  }
  
  public static final class b
    implements c.c
  {
    private final int aCF;
    private final Status azY;
    
    public b(Status paramStatus, int paramInt)
    {
      this.azY = paramStatus;
      this.aCF = paramInt;
    }
    
    public final Status jW()
    {
      return this.azY;
    }
  }
  
  public static final class c
    implements c.d
  {
    private volatile ParcelFileDescriptor aCG;
    private volatile InputStream aCH;
    private final Status azY;
    private volatile boolean mClosed = false;
    
    public c(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.azY = paramStatus;
      this.aCG = paramParcelFileDescriptor;
    }
    
    public final InputStream getInputStream()
    {
      if (this.mClosed) {
        throw new IllegalStateException("Cannot access the input stream after release().");
      }
      if (this.aCG == null) {
        return null;
      }
      if (this.aCH == null) {
        this.aCH = new ParcelFileDescriptor.AutoCloseInputStream(this.aCG);
      }
      return this.aCH;
    }
    
    public final Status jW()
    {
      return this.azY;
    }
    
    public final void release()
    {
      if (this.aCG == null) {
        return;
      }
      if (this.mClosed) {
        throw new IllegalStateException("releasing an already released result.");
      }
      try
      {
        if (this.aCH != null) {
          this.aCH.close();
        }
        for (;;)
        {
          this.mClosed = true;
          this.aCG = null;
          this.aCH = null;
          return;
          this.aCG.close();
        }
        return;
      }
      catch (IOException localIOException) {}
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */