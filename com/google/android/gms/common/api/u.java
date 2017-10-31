package com.google.android.gms.common.api;

import android.app.PendingIntent;
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
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public final class u
  extends Fragment
  implements DialogInterface.OnCancelListener
{
  public boolean aiS;
  public int aiT = -1;
  public ConnectionResult aiU;
  public final Handler aiV = new Handler(Looper.getMainLooper());
  final SparseArray<a> aiW = new SparseArray();
  public boolean mT;
  
  public static u a(FragmentActivity paramFragmentActivity)
  {
    w.ag("Must be called from main thread of process");
    paramFragmentActivity = paramFragmentActivity.aR();
    try
    {
      u localu = (u)paramFragmentActivity.l("GmsSupportLifecycleFragment");
      if (localu != null)
      {
        paramFragmentActivity = localu;
        if (!localu.ow) {}
      }
      else
      {
        paramFragmentActivity = null;
      }
      return paramFragmentActivity;
    }
    catch (ClassCastException paramFragmentActivity)
    {
      throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", paramFragmentActivity);
    }
  }
  
  public static u b(FragmentActivity paramFragmentActivity)
  {
    u localu = a(paramFragmentActivity);
    l locall = paramFragmentActivity.aR();
    paramFragmentActivity = localu;
    if (localu == null)
    {
      paramFragmentActivity = new u();
      locall.aV().a(paramFragmentActivity, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
      locall.executePendingTransactions();
    }
    return paramFragmentActivity;
  }
  
  public final void a(int paramInt, ConnectionResult paramConnectionResult)
  {
    Object localObject = (a)this.aiW.get(paramInt);
    if (localObject != null)
    {
      a locala = (a)this.aiW.get(paramInt);
      this.aiW.remove(paramInt);
      if (locala != null)
      {
        locala.aiY.b(locala);
        locala.aiY.disconnect();
      }
      localObject = ((a)localObject).aiZ;
      if (localObject != null) {
        ((c.c)localObject).a(paramConnectionResult);
      }
    }
    km();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    int i = 0;
    while (i < this.aiW.size())
    {
      paramFileDescriptor = (a)this.aiW.valueAt(i);
      paramPrintWriter.append(paramString).append("GoogleApiClient #").print(paramFileDescriptor.aiX);
      paramPrintWriter.println(":");
      paramFileDescriptor.aiY.a(paramString + "  ", paramPrintWriter);
      i += 1;
    }
  }
  
  public final void km()
  {
    this.aiS = false;
    this.aiT = -1;
    this.aiU = null;
    int i = 0;
    while (i < this.aiW.size())
    {
      ((a)this.aiW.valueAt(i)).aiY.connect();
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
    this.mT = true;
    if (!this.aiS)
    {
      int i = 0;
      while (i < this.aiW.size())
      {
        ((a)this.aiW.valueAt(i)).aiY.connect();
        i += 1;
      }
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    this.mT = false;
    int i = 0;
    while (i < this.aiW.size())
    {
      ((a)this.aiW.valueAt(i)).aiY.disconnect();
      i += 1;
    }
  }
  
  private final class a
    implements c.c
  {
    public final int aiX;
    public final c aiY;
    public final c.c aiZ;
    
    public a(int paramInt, c paramc, c.c paramc1)
    {
      this.aiX = paramInt;
      this.aiY = paramc;
      this.aiZ = paramc1;
      paramc.a(this);
    }
    
    public final void a(ConnectionResult paramConnectionResult)
    {
      u.this.aiV.post(new u.b(u.this, this.aiX, paramConnectionResult));
    }
  }
  
  private final class b
    implements Runnable
  {
    private final int ajb;
    private final ConnectionResult ajc;
    
    public b(int paramInt, ConnectionResult paramConnectionResult)
    {
      this.ajb = paramInt;
      this.ajc = paramConnectionResult;
    }
    
    public final void run()
    {
      if ((!u.this.mT) || (u.this.aiS)) {
        return;
      }
      u.this.aiS = true;
      u.this.aiT = this.ajb;
      u.this.aiU = this.ajc;
      if (this.ajc.jG()) {
        try
        {
          int i = u.this.aG().aR().aW().indexOf(u.this);
          this.ajc.a(u.this.aG(), (i + 1 << 16) + 1);
          return;
        }
        catch (IntentSender.SendIntentException localSendIntentException)
        {
          u.this.km();
          return;
        }
      }
      if (e.bS(this.ajc.agH))
      {
        e.a(this.ajc.agH, u.this.aG(), u.this, u.this);
        return;
      }
      u.this.a(this.ajb, this.ajc);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/google/android/gms/common/api/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */