package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.d;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i;
import com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI;
import com.tencent.mm.sdk.platformtools.w;

public abstract class a
  extends i
{
  public boolean qmB;
  protected boolean qmC;
  public boolean qmD;
  private BroadcastReceiver sZ;
  
  public a(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
    GMTrace.i(17096922628096L, 127382);
    this.qmC = SnsAdNativeLandingPagesUI.qFO;
    this.sZ = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(17131685019648L, 127641);
        if (("com.tencent.mm.adlanding.close_exposure_voice".equals(paramAnonymousIntent.getAction())) && (!a.this.biV().qno.equals(paramAnonymousIntent.getStringExtra("para_id"))))
        {
          paramAnonymousContext = a.this;
          if (paramAnonymousContext.qmD) {
            paramAnonymousContext.bit();
          }
        }
        GMTrace.o(17131685019648L, 127641);
      }
    };
    d.l(this.context).a(this.sZ, new IntentFilter("com.tencent.mm.adlanding.close_exposure_voice"));
    w.v("AbsVideoPlayComp", "register receiver " + this.sZ);
    GMTrace.o(17096922628096L, 127382);
  }
  
  public void O(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(17097593716736L, 127387);
    super.O(paramInt1, paramInt2, paramInt3);
    GMTrace.o(17097593716736L, 127387);
  }
  
  public void bit()
  {
    GMTrace.i(17097056845824L, 127383);
    this.qmB = false;
    GMTrace.o(17097056845824L, 127383);
  }
  
  public void biu()
  {
    GMTrace.i(17097191063552L, 127384);
    super.biu();
    d.l(this.context).unregisterReceiver(this.sZ);
    this.qmD = true;
    w.v("AbsVideoPlayComp", "unregister receiver " + this.sZ);
    GMTrace.o(17097191063552L, 127384);
  }
  
  public void biv()
  {
    GMTrace.i(17097325281280L, 127385);
    super.biv();
    this.qmD = true;
    GMTrace.o(17097325281280L, 127385);
  }
  
  public void biw()
  {
    GMTrace.i(17097459499008L, 127386);
    super.biw();
    this.qmD = false;
    GMTrace.o(17097459499008L, 127386);
  }
  
  public void bix()
  {
    GMTrace.i(17097727934464L, 127388);
    this.qmB = true;
    GMTrace.o(17097727934464L, 127388);
  }
  
  public final void biy()
  {
    GMTrace.i(17097862152192L, 127389);
    Intent localIntent = new Intent("com.tencent.mm.adlanding.close_exposure_voice");
    localIntent.putExtra("para_id", biV().qno);
    d.l(this.context).a(localIntent);
    GMTrace.o(17097862152192L, 127389);
  }
  
  protected final void biz()
  {
    GMTrace.i(17098130587648L, 127391);
    super.biz();
    if (!this.qmC)
    {
      bit();
      GMTrace.o(17098130587648L, 127391);
      return;
    }
    bix();
    GMTrace.o(17098130587648L, 127391);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */