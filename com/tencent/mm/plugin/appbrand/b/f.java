package com.tencent.mm.plugin.appbrand.b;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.d.c;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService.StopBackgroundMusicTask;
import com.tencent.mm.plugin.appbrand.media.AppBrandMusicClientService.b;
import com.tencent.mm.plugin.appbrand.ui.banner.AppBrandStickyBannerLogic.a;
import com.tencent.mm.plugin.appbrand.ui.banner.e;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;

abstract class f
  extends g
{
  int iDi;
  private final AppBrandMusicClientService.b iDj;
  private final e iDk;
  public final com.tencent.mm.plugin.appbrand.f irS;
  
  f(h paramh, com.tencent.mm.plugin.appbrand.f paramf)
  {
    super(paramh);
    GMTrace.i(18870341468160L, 140595);
    this.iDi = 0;
    this.iDj = new AppBrandMusicClientService.b()
    {
      public final void SW()
      {
        GMTrace.i(18869536161792L, 140589);
        f.this.hP(1);
        GMTrace.o(18869536161792L, 140589);
      }
      
      public final void onStop()
      {
        GMTrace.i(18869670379520L, 140590);
        f.this.hP(1);
        GMTrace.o(18869670379520L, 140590);
      }
    };
    this.iDk = new e()
    {
      public final void X(String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(18875307524096L, 140632);
        if (f.this.irS.iqL.equals(paramAnonymousString))
        {
          GMTrace.o(18875307524096L, 140632);
          return;
        }
        f.this.hP(2);
        GMTrace.o(18875307524096L, 140632);
      }
    };
    this.irS = paramf;
    GMTrace.o(18870341468160L, 140595);
  }
  
  private void hO(int paramInt)
  {
    GMTrace.i(18870744121344L, 140598);
    this.iDi |= paramInt;
    GMTrace.o(18870744121344L, 140598);
  }
  
  abstract void ST();
  
  public void enter()
  {
    GMTrace.i(18870475685888L, 140596);
    super.enter();
    this.iDi = 0;
    Object localObject1 = this.irS.iqL;
    int j = this.irS.iqN.iCo;
    int i;
    Object localObject2;
    AppBrandMusicClientService.b localb;
    if ((this.irS.iqO != null) && (this.irS.iqO.iIX))
    {
      i = 1;
      if (i == 0) {
        break label247;
      }
      if (AppBrandMusicClientService.qQ((String)localObject1))
      {
        hO(1);
        localObject2 = AppBrandMusicClientService.jhe;
        localb = this.iDj;
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (localb != null)) {
          break label195;
        }
      }
      label100:
      if ((d.nJ((String)localObject1) == d.c.iqD) || (AppBrandStickyBannerLogic.a.aw((String)localObject1, j)))
      {
        hO(2);
        AppBrandStickyBannerLogic.a.d(this.iDk);
      }
      localObject1 = d.nJ((String)localObject1);
      switch (3.iDm[localObject1.ordinal()])
      {
      }
    }
    for (;;)
    {
      this.iDi = this.iDi;
      hP(0);
      GMTrace.o(18870475685888L, 140596);
      return;
      i = 0;
      break;
      label195:
      if (!((AppBrandMusicClientService)localObject2).jhd.containsKey(localObject1))
      {
        ((AppBrandMusicClientService)localObject2).jhd.put(localObject1, localb);
        break label100;
      }
      ((AppBrandMusicClientService)localObject2).jhd.remove(localObject1);
      ((AppBrandMusicClientService)localObject2).jhd.put(localObject1, localb);
      break label100;
      label247:
      localObject2 = AppBrandMusicClientService.jhe;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label100;
      }
      if (!((String)localObject1).equalsIgnoreCase(((AppBrandMusicClientService)localObject2).jhf))
      {
        w.e("MicroMsg.AppBrandMusicClientService", "appId is diff, can't stop music");
        break label100;
      }
      localObject2 = new AppBrandMusicClientService.StopBackgroundMusicTask();
      ((AppBrandMusicClientService.StopBackgroundMusicTask)localObject2).appId = ((String)localObject1);
      AppBrandMainProcessService.a((MainProcessTask)localObject2);
      break label100;
      hO(16);
      continue;
      hO(4);
      continue;
      hO(8);
    }
  }
  
  public void exit()
  {
    GMTrace.i(18870609903616L, 140597);
    super.exit();
    this.iDi = 0;
    AppBrandMusicClientService localAppBrandMusicClientService = AppBrandMusicClientService.jhe;
    String str = this.irS.iqL;
    if ((!TextUtils.isEmpty(str)) && (localAppBrandMusicClientService.jhd.containsKey(str))) {
      localAppBrandMusicClientService.jhd.remove(str);
    }
    AppBrandStickyBannerLogic.a.c(this.iDk);
    GMTrace.o(18870609903616L, 140597);
  }
  
  public final void hP(int paramInt)
  {
    GMTrace.i(18870878339072L, 140599);
    this.iDi &= (paramInt ^ 0xFFFFFFFF);
    if (this.iDi == 0) {
      ST();
    }
    GMTrace.o(18870878339072L, 140599);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */