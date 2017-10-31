package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.p;
import android.support.v4.app.s;
import android.support.v4.app.s.a;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public final class v
  extends Fragment
  implements DialogInterface.OnCancelListener, s.a<ConnectionResult>
{
  private boolean aiS;
  private int aiT = -1;
  private ConnectionResult aiU;
  private final Handler aiV = new Handler(Looper.getMainLooper());
  public final SparseArray<b> aiW = new SparseArray();
  
  public static v c(FragmentActivity paramFragmentActivity)
  {
    w.ag("Must be called from main thread of process");
    l locall = paramFragmentActivity.aR();
    try
    {
      v localv = (v)locall.l("GmsSupportLoaderLifecycleFragment");
      if (localv != null)
      {
        paramFragmentActivity = localv;
        if (!localv.ow) {}
      }
      else
      {
        paramFragmentActivity = new v();
        locall.aV().a(paramFragmentActivity, "GmsSupportLoaderLifecycleFragment").commit();
        locall.executePendingTransactions();
      }
      return paramFragmentActivity;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", paramFragmentActivity);
    }
  }
  
  public final android.support.v4.content.c<ConnectionResult> K(int paramInt)
  {
    return new a(aG(), ((b)this.aiW.get(paramInt)).aiY);
  }
  
  public final void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    Object localObject = (b)this.aiW.get(paramInt);
    if (localObject != null)
    {
      this.aiW.remove(paramInt);
      aI().destroyLoader(paramInt);
      localObject = ((b)localObject).aiZ;
      if (localObject != null) {
        ((c.c)localObject).a(paramConnectionResult);
      }
    }
    km();
  }
  
  public final a bX(int paramInt)
  {
    try
    {
      a locala = (a)aI().J(paramInt);
      return locala;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", localClassCastException);
    }
  }
  
  public final void km()
  {
    int i = 0;
    this.aiS = false;
    this.aiT = -1;
    this.aiU = null;
    s locals = aI();
    while (i < this.aiW.size())
    {
      int j = this.aiW.keyAt(i);
      a locala = bX(j);
      if ((locala != null) && (locala.ajd))
      {
        locals.destroyLoader(j);
        locals.a(j, this);
      }
      i += 1;
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      paramInt1 = 0;
    }
    for (;;)
    {
      if (paramInt1 == 0) {
        break label66;
      }
      km();
      return;
      if (e.x(aG()) != 0) {
        break;
      }
      paramInt1 = i;
      continue;
      if (paramInt2 != -1) {
        break;
      }
      paramInt1 = i;
    }
    label66:
    a(this.aiT, this.aiU);
  }
  
  public final void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    int i = 0;
    if (i < this.aiW.size())
    {
      int j = this.aiW.keyAt(i);
      paramActivity = bX(j);
      if ((paramActivity != null) && (((b)this.aiW.valueAt(i)).aiY != paramActivity.aiY)) {
        aI().b(j, this);
      }
      for (;;)
      {
        i += 1;
        break;
        aI().a(j, this);
      }
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    a(this.aiT, new ConnectionResult(13, null));
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.aiS = paramBundle.getBoolean("resolving_error", false);
      this.aiT = paramBundle.getInt("failed_client_id", -1);
      if (this.aiT >= 0) {
        this.aiU = new ConnectionResult(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution"));
      }
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("resolving_error", this.aiS);
    if (this.aiT >= 0)
    {
      paramBundle.putInt("failed_client_id", this.aiT);
      paramBundle.putInt("failed_status", this.aiU.agH);
      paramBundle.putParcelable("failed_resolution", this.aiU.agI);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    if (!this.aiS)
    {
      int i = 0;
      while (i < this.aiW.size())
      {
        aI().a(this.aiW.keyAt(i), this);
        i += 1;
      }
    }
  }
  
  public static final class a
    extends android.support.v4.content.c<ConnectionResult>
    implements c.b, c.c
  {
    public final c aiY;
    boolean ajd;
    private ConnectionResult aje;
    
    public a(Context paramContext, c paramc)
    {
      super();
      this.aiY = paramc;
    }
    
    private void g(ConnectionResult paramConnectionResult)
    {
      this.aje = paramConnectionResult;
      if ((this.mT) && (!this.sO)) {
        deliverResult(paramConnectionResult);
      }
    }
    
    public final void a(ConnectionResult paramConnectionResult)
    {
      this.ajd = true;
      g(paramConnectionResult);
    }
    
    public final void bU(int paramInt) {}
    
    public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      this.aiY.a(paramString, paramPrintWriter);
    }
    
    public final void g(Bundle paramBundle)
    {
      this.ajd = false;
      g(ConnectionResult.agG);
    }
    
    protected final void onReset()
    {
      this.aje = null;
      this.ajd = false;
      this.aiY.b(this);
      this.aiY.b(this);
      this.aiY.disconnect();
    }
    
    protected final void onStartLoading()
    {
      super.onStartLoading();
      this.aiY.a(this);
      this.aiY.a(this);
      if (this.aje != null) {
        deliverResult(this.aje);
      }
      if ((!this.aiY.isConnected()) && (!this.aiY.isConnecting()) && (!this.ajd)) {
        this.aiY.connect();
      }
    }
    
    protected final void onStopLoading()
    {
      this.aiY.disconnect();
    }
  }
  
  private static final class b
  {
    public final c aiY;
    public final c.c aiZ;
    
    public b(c paramc, c.c paramc1)
    {
      this.aiY = paramc;
      this.aiZ = paramc1;
    }
  }
  
  private final class c
    implements Runnable
  {
    private final int ajb;
    private final ConnectionResult ajc;
    
    public c(int paramInt, ConnectionResult paramConnectionResult)
    {
      this.ajb = paramInt;
      this.ajc = paramConnectionResult;
    }
    
    public final void run()
    {
      if (this.ajc.jG()) {
        try
        {
          int i = v.this.aG().aR().aW().indexOf(v.this);
          this.ajc.a(v.this.aG(), (i + 1 << 16) + 1);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          v.this.km();
          return;
        }
      }
      if (e.bS(this.ajc.agH))
      {
        e.a(this.ajc.agH, v.this.aG(), v.this, v.this);
        return;
      }
      v.this.a(this.ajb, this.ajc);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */