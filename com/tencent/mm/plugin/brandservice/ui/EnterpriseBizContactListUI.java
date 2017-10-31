package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ae.b;
import com.tencent.mm.ae.e;
import com.tencent.mm.ae.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import java.util.List;

public class EnterpriseBizContactListUI
  extends MMActivity
{
  private long gCB;
  private long hPs;
  public String kkq;
  private com.tencent.mm.ui.tools.m kkr;
  private EnterpriseBizContactListView kks;
  private ae kkt;
  private boolean kku;
  
  public EnterpriseBizContactListUI()
  {
    GMTrace.i(10890023796736L, 81137);
    this.kku = false;
    this.hPs = 0L;
    GMTrace.o(10890023796736L, 81137);
  }
  
  protected final void MH()
  {
    GMTrace.i(10890963320832L, 81144);
    ap.AS();
    rV(com.tencent.mm.x.c.yL().SL(this.kkq).vp());
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10872575492096L, 81007);
        EnterpriseBizContactListUI.this.aKl();
        EnterpriseBizContactListUI.this.finish();
        GMTrace.o(10872575492096L, 81007);
        return true;
      }
    });
    if (!bg.mZ(this.kkq))
    {
      com.tencent.mm.ae.d locald = f.iv(this.kkq);
      if ((locald != null) && (locald.EE())) {
        a(1, R.l.dsU, R.k.dkz, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(10888950054912L, 81129);
            if (EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this) != null)
            {
              EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).dismiss();
              EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this, null);
            }
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this, new com.tencent.mm.ui.tools.m(EnterpriseBizContactListUI.this.vov.voR));
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).qQS = new o.c()
            {
              public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
              {
                GMTrace.i(10866669912064L, 80963);
                paramAnonymous2m.X(2, R.l.dNR, R.k.dpK);
                paramAnonymous2m.X(3, R.l.dTi, R.k.dkD);
                paramAnonymous2m.X(4, R.l.dsV, R.k.dkN);
                GMTrace.o(10866669912064L, 80963);
              }
            };
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).qQT = new o.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(10877273112576L, 81042);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(10877273112576L, 81042);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Select_Talker_Name", EnterpriseBizContactListUI.this.kkq);
                  paramAnonymous2MenuItem.putExtra("Select_block_List", EnterpriseBizContactListUI.this.kkq);
                  paramAnonymous2MenuItem.putExtra("Select_Send_Card", true);
                  paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
                  com.tencent.mm.bi.d.a(EnterpriseBizContactListUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
                  GMTrace.o(10877273112576L, 81042);
                  return;
                  paramAnonymous2MenuItem = new Intent(EnterpriseBizContactListUI.this, EnterpriseBizContactPlainListUI.class);
                  paramAnonymous2MenuItem.putExtra("enterprise_biz_name", EnterpriseBizContactListUI.this.kkq);
                  paramAnonymous2MenuItem.putExtra("enterprise_scene", 2);
                  EnterpriseBizContactListUI.this.startActivity(paramAnonymous2MenuItem);
                  GMTrace.o(10877273112576L, 81042);
                  return;
                  paramAnonymous2MenuItem = new Intent();
                  paramAnonymous2MenuItem.putExtra("Contact_User", EnterpriseBizContactListUI.this.kkq);
                  com.tencent.mm.plugin.brandservice.a.ifM.d(paramAnonymous2MenuItem, EnterpriseBizContactListUI.this);
                }
              }
            };
            EnterpriseBizContactListUI.a(EnterpriseBizContactListUI.this).dL();
            GMTrace.o(10888950054912L, 81129);
            return false;
          }
        });
      }
    }
    this.kks = ((EnterpriseBizContactListView)findViewById(R.h.bEI));
    this.kks.kkq = this.kkq;
    this.kks.kkx = false;
    this.kks.refresh();
    this.kks.ahN();
    GMTrace.o(10890963320832L, 81144);
  }
  
  public void finish()
  {
    GMTrace.i(10890829103104L, 81143);
    this.hPs = (System.currentTimeMillis() / 1000L);
    super.finish();
    GMTrace.o(10890829103104L, 81143);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10890158014464L, 81138);
    int i = R.i.cSR;
    GMTrace.o(10890158014464L, 81138);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10891097538560L, 81145);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default: 
      GMTrace.o(10891097538560L, 81145);
      return;
    }
    if ((paramInt2 == -1) && (paramIntent != null))
    {
      String str1 = paramIntent.getStringExtra("be_send_card_name");
      String str2 = paramIntent.getStringExtra("received_card_name");
      boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      com.tencent.mm.plugin.messenger.a.d.aNb().l(str1, str2, bool);
      com.tencent.mm.plugin.messenger.a.d.aNb().cM(paramIntent, str2);
      com.tencent.mm.ui.snackbar.a.e(this, this.vov.voR.getString(R.l.dZv));
      GMTrace.o(10891097538560L, 81145);
      return;
    }
    GMTrace.o(10891097538560L, 81145);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10890292232192L, 81139);
    super.onCreate(paramBundle);
    this.kkq = getIntent().getStringExtra("enterprise_biz_name");
    this.gCB = (System.currentTimeMillis() / 1000L);
    if (this.kkt == null) {
      this.kkt = new ae()
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(10910290673664L, 81288);
          if ((paramAnonymousMessage != null) && (paramAnonymousMessage.what == 1) && (EnterpriseBizContactListUI.this != null) && (!EnterpriseBizContactListUI.this.isFinishing()))
          {
            com.tencent.mm.ae.x.FO().hZ(EnterpriseBizContactListUI.this.kkq);
            com.tencent.mm.ae.x.FE();
            paramAnonymousMessage = e.iq(EnterpriseBizContactListUI.this.kkq);
            int i = 0;
            while (i < paramAnonymousMessage.size())
            {
              String str = (String)paramAnonymousMessage.get(i);
              if ((o.fm(str)) && ((f.iB(str)) || (f.dG(str)))) {
                com.tencent.mm.ae.x.FO().hZ(str);
              }
              i += 1;
            }
          }
          GMTrace.o(10910290673664L, 81288);
        }
      };
    }
    for (;;)
    {
      this.kkt.sendEmptyMessageDelayed(1, 500L);
      GMTrace.o(10890292232192L, 81139);
      return;
      this.kkt.removeMessages(1);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10890694885376L, 81142);
    if (this.kks != null) {
      EnterpriseBizContactListView.release();
    }
    if ((this.gCB <= 0L) || (this.hPs <= 0L))
    {
      super.onDestroy();
      GMTrace.o(10890694885376L, 81142);
      return;
    }
    long l = this.hPs - this.gCB;
    b localb = com.tencent.mm.ae.x.FL().ia(this.kkq);
    int i;
    if (localb != null)
    {
      i = localb.field_qyUin;
      label84:
      if (localb == null) {
        break label206;
      }
    }
    label206:
    for (int j = localb.field_userUin;; j = 0)
    {
      g.paX.i(13465, new Object[] { "", Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      w.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", new Object[] { Integer.valueOf(i), Integer.valueOf(0), Integer.valueOf(j), Integer.valueOf(2), Long.valueOf(l) });
      break;
      i = 0;
      break label84;
    }
  }
  
  protected void onPause()
  {
    GMTrace.i(10890560667648L, 81141);
    super.onPause();
    GMTrace.o(10890560667648L, 81141);
  }
  
  protected void onResume()
  {
    GMTrace.i(10890426449920L, 81140);
    super.onResume();
    if (!o.fm(this.kkq))
    {
      w.e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", new Object[] { this.kkq });
      finish();
      GMTrace.o(10890426449920L, 81140);
      return;
    }
    MH();
    int k;
    int i;
    b localb;
    int j;
    long l1;
    if (!this.kku)
    {
      k = getIntent().getIntExtra("enterprise_from_scene", 5);
      i = -1;
      if (this.kks != null) {
        i = this.kks.kkz;
      }
      localb = com.tencent.mm.ae.x.FL().ia(this.kkq);
      if (localb == null) {
        break label385;
      }
      j = localb.field_qyUin;
      if (localb == null) {
        break label390;
      }
      l1 = localb.field_wwCorpId;
      label132:
      if (localb == null) {
        break label396;
      }
    }
    label385:
    label390:
    label396:
    for (long l2 = localb.field_wwUserVid;; l2 = 0L)
    {
      g.paX.i(12892, new Object[] { this.kkq, Integer.valueOf(k), Integer.valueOf(i), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2) });
      w.d("MicroMsg.BrandService.EnterpriseBizContactListUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { this.kkq, Integer.valueOf(k), Integer.valueOf(i), "", Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l2) });
      this.kku = true;
      GMTrace.o(10890426449920L, 81140);
      return;
      j = 0;
      break;
      l1 = 0L;
      break label132;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */