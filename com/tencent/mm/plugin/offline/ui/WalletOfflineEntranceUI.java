package com.tencent.mm.plugin.offline.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.ac.k;
import com.tencent.mm.bi.d;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;

@com.tencent.mm.ui.base.a(7)
public class WalletOfflineEntranceUI
  extends WalletBaseUI
{
  private int hys;
  boolean opV;
  
  public WalletOfflineEntranceUI()
  {
    GMTrace.i(6226226184192L, 46389);
    this.opV = true;
    this.hys = -1;
    GMTrace.o(6226226184192L, 46389);
  }
  
  private void init()
  {
    int i = 3;
    GMTrace.i(6226628837376L, 46392);
    Intent localIntent = getIntent();
    int j;
    if ((localIntent != null) && (localIntent.hasExtra("key_from_scene")))
    {
      j = localIntent.getIntExtra("key_from_scene", 0);
      if (j != 1) {
        break label120;
      }
      this.hys = 1;
      i = 2;
    }
    for (;;)
    {
      g.paX.i(14021, new Object[] { Integer.valueOf(1), Integer.valueOf(i) });
      if (!com.tencent.mm.plugin.wallet_core.model.m.bwE().bwX()) {
        break;
      }
      w.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isDataInvalid()");
      b(new com.tencent.mm.plugin.wallet_core.b.m(null, 8), true);
      this.opV = false;
      GMTrace.o(6226628837376L, 46392);
      return;
      label120:
      if (j == 2)
      {
        this.hys = 2;
        i = 1;
      }
      else if (j == 3)
      {
        this.hys = 3;
      }
      else if (j == 4)
      {
        this.hys = 4;
        i = 6;
      }
      else if (j == 5)
      {
        this.hys = 8;
        i = 4;
      }
      else
      {
        this.hys = 0;
        w.i("MicroMsg.WalletOfflineEntranceUI", "unknown scene: %d", new Object[] { Integer.valueOf(j) });
        i = 1;
      }
    }
    localIntent = new Intent();
    localIntent.putExtra("key_entry_scene", this.hys);
    String str = getIntent().getStringExtra("key_business_attach");
    if (!bg.mZ(str)) {
      localIntent.putExtra("key_business_attach", str);
    }
    localIntent.putExtra("is_offline_create", getIntent().getBooleanExtra("is_offline_create", false));
    d.b(this.vov.voR, "offline", ".ui.WalletOfflineCoinPurseUI", localIntent);
    finish();
    GMTrace.o(6226628837376L, 46392);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6226897272832L, 46394);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd SUCC");
      init();
      GMTrace.o(6226897272832L, 46394);
      return true;
    }
    w.i("MicroMsg.WalletOfflineEntranceUI", "net error: %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    init();
    w.e("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onSceneEnd FAIL");
    GMTrace.o(6226897272832L, 46394);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6226360401920L, 46390);
    int i = R.i.diM;
    GMTrace.o(6226360401920L, 46390);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6226494619648L, 46391);
    super.onCreate(paramBundle);
    w.v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onCreate()");
    h.g(this, 1);
    e.Eh(30);
    com.tencent.mm.wallet_core.c.a.ciD();
    com.tencent.mm.wallet_core.c.a.init(getApplicationContext());
    int i;
    if (getIntent() != null)
    {
      i = getIntent().getIntExtra("key_from_scene", 0);
      w.i("MicroMsg.WalletOfflineEntranceUI", "parserCardData(), scene is " + i);
      if (i != 3) {
        break label240;
      }
      com.tencent.mm.plugin.offline.c.a.oqc = i;
      i = getIntent().getIntExtra("key_expire_time", 0);
      long l = getIntent().getLongExtra("key_begin_time", 0L);
      boolean bool = getIntent().getBooleanExtra("key_is_mark", false);
      w.i("MicroMsg.WalletOfflineEntranceUI", "expire_time:" + i + " beginTime:" + l + " isMark:" + bool);
      com.tencent.mm.plugin.offline.c.a.oqd = i;
      com.tencent.mm.plugin.offline.c.a.oqe = l;
      com.tencent.mm.plugin.offline.c.a.oqf = bool;
      com.tencent.mm.plugin.offline.c.a.kmv = getIntent().getStringExtra("key_card_id");
      com.tencent.mm.plugin.offline.c.a.oqg = getIntent().getStringExtra("key_user_card_id");
    }
    for (com.tencent.mm.plugin.offline.c.a.oqh = getIntent().getStringExtra("key_card_code");; com.tencent.mm.plugin.offline.c.a.oqh = "")
    {
      label240:
      do
      {
        getIntent().getIntExtra("key_from_scene", 0);
        init();
        GMTrace.o(6226494619648L, 46391);
        return;
      } while ((i != 1) && (i != 2) && (i != 4));
      com.tencent.mm.plugin.offline.c.a.oqc = i;
      com.tencent.mm.plugin.offline.c.a.oqd = 0;
      com.tencent.mm.plugin.offline.c.a.oqe = 0L;
      com.tencent.mm.plugin.offline.c.a.oqf = false;
      com.tencent.mm.plugin.offline.c.a.kmv = "";
      com.tencent.mm.plugin.offline.c.a.oqg = "";
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6227031490560L, 46395);
    if (paramInt == 4) {
      finish();
    }
    GMTrace.o(6227031490560L, 46395);
    return true;
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    GMTrace.i(6227165708288L, 46396);
    if ((paramIntent != null) && (paramIntent.hasExtra("is_offline_create")))
    {
      w.i("MicroMsg.WalletOfflineEntranceUI", "onNewIntent");
      this.opV = true;
    }
    GMTrace.o(6227165708288L, 46396);
  }
  
  public void onResume()
  {
    GMTrace.i(6226763055104L, 46393);
    super.onResume();
    w.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI onResume()");
    if (this.opV)
    {
      w.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is true , finish activity");
      if (com.tencent.mm.plugin.offline.c.a.aUp())
      {
        w.v("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() true");
        Intent localIntent = new Intent();
        localIntent.putExtra("key_entry_scene", this.hys);
        d.b(this.vov.voR, "offline", ".ui.WalletOfflineCoinPurseUI", localIntent);
      }
      for (;;)
      {
        finish();
        GMTrace.o(6226763055104L, 46393);
        return;
        w.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isOfflineCreate() false");
      }
    }
    w.i("MicroMsg.WalletOfflineEntranceUI", "WalletOfflineEntranceUI isShouldFinishOnResume is false , not finish activity");
    this.opV = true;
    GMTrace.o(6226763055104L, 46393);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/offline/ui/WalletOfflineEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */