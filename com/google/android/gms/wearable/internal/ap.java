package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.a.a;
import com.google.android.gms.wearable.b.a;
import com.google.android.gms.wearable.c.b;
import com.google.android.gms.wearable.e;
import com.google.android.gms.wearable.k.a;
import com.google.android.gms.wearable.n.b;
import com.google.android.gms.wearable.n.c;
import com.google.android.gms.wearable.q.a;
import com.google.android.gms.wearable.r.a;
import java.util.List;

final class ap<T>
  extends w.a
{
  q.a aCp;
  r.a aCq;
  c.b aCr;
  k.a aCs;
  n.b aCt;
  n.c aCu;
  b.a aCv;
  a.a aCw;
  final IntentFilter[] aCx;
  final String aCy;
  final String aCz;
  
  public final void a(DataHolder paramDataHolder)
  {
    if (this.aCr != null) {
      try
      {
        this.aCr.a(new e(paramDataHolder));
        return;
      }
      finally
      {
        paramDataHolder.close();
      }
    }
    paramDataHolder.close();
  }
  
  public final void a(AmsEntityUpdateParcelable paramAmsEntityUpdateParcelable) {}
  
  public final void a(AncsNotificationParcelable paramAncsNotificationParcelable) {}
  
  public final void a(CapabilityInfoParcelable paramCapabilityInfoParcelable) {}
  
  public final void a(ChannelEventParcelable paramChannelEventParcelable)
  {
    if (this.aCv != null) {
      paramChannelEventParcelable.a(this.aCv);
    }
  }
  
  public final void a(MessageEventParcelable paramMessageEventParcelable)
  {
    if (this.aCs != null) {
      this.aCs.a(paramMessageEventParcelable);
    }
  }
  
  public final void a(NodeParcelable paramNodeParcelable)
  {
    if (this.aCt != null) {
      this.aCt.a(paramNodeParcelable);
    }
  }
  
  public final void b(NodeParcelable paramNodeParcelable)
  {
    if (this.aCt != null) {
      this.aCt.b(paramNodeParcelable);
    }
  }
  
  public final void n(List<NodeParcelable> paramList) {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/wearable/internal/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */