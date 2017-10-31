package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.a.oy;
import com.tencent.mm.g.a.pj;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.m;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.v;
import com.tencent.mm.plugin.sns.storage.s;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.x.o;
import java.util.LinkedList;
import java.util.List;

public class SnsPermissionUI
  extends MMPreference
  implements e
{
  public q ikZ;
  private f ilZ;
  private boolean qMq;
  private x qMr;
  private boolean qMs;
  private boolean qMt;
  private long qMu;
  private int scene;
  private String userName;
  
  public SnsPermissionUI()
  {
    GMTrace.i(8472628297728L, 63126);
    this.ikZ = null;
    this.userName = "";
    this.qMq = false;
    this.qMr = null;
    this.qMs = false;
    this.qMt = false;
    this.qMu = 0L;
    this.scene = 0;
    GMTrace.o(8472628297728L, 63126);
  }
  
  private static boolean Io(String paramString)
  {
    GMTrace.i(8473567821824L, 63133);
    s locals = ae.bhu().dR(5L);
    if (bg.mZ(locals.field_memberList))
    {
      GMTrace.o(8473567821824L, 63133);
      return false;
    }
    boolean bool = bg.f(locals.field_memberList.split(",")).contains(paramString);
    GMTrace.o(8473567821824L, 63133);
    return bool;
  }
  
  private void bcT()
  {
    GMTrace.i(8473433604096L, 63132);
    com.tencent.mm.kernel.h.xA();
    this.qMr = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(this.userName);
    this.qMr.setUsername(this.userName);
    boolean bool1 = this.qMr.vk();
    boolean bool2 = Io(this.userName);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ilZ.UM("sns_outside_permiss");
    localCheckBoxPreference.vNl = bool1;
    int i = this.qMr.gbM;
    w.d("MicroMsg.SnsPermissionUI", "sex:%d", new Object[] { Integer.valueOf(i) });
    if (i == 1)
    {
      localCheckBoxPreference.setTitle(i.j.pTm);
      localCheckBoxPreference = (CheckBoxPreference)this.ilZ.UM("sns_black_permiss");
      if (i != 1) {
        break label220;
      }
      localCheckBoxPreference.setTitle(i.j.pRN);
    }
    for (;;)
    {
      localCheckBoxPreference.vNl = bool2;
      if (!com.tencent.mm.l.a.eE(this.qMr.field_type)) {
        this.ilZ.UN("sns_black_permiss");
      }
      this.ilZ.notifyDataSetChanged();
      GMTrace.o(8473433604096L, 63132);
      return;
      if (i != 2) {
        break;
      }
      localCheckBoxPreference.setTitle(i.j.pTl);
      break;
      label220:
      if (i == 2) {
        localCheckBoxPreference.setTitle(i.j.pRM);
      }
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(8473299386368L, 63131);
    this.ilZ = this.vOv;
    oC(i.j.pTn);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8714085990400L, 64925);
        SnsPermissionUI.this.aKl();
        SnsPermissionUI.this.setResult(-1, new Intent());
        SnsPermissionUI.this.finish();
        GMTrace.o(8714085990400L, 64925);
        return true;
      }
    });
    bcT();
    GMTrace.o(8473299386368L, 63131);
  }
  
  public final int QD()
  {
    GMTrace.i(8473165168640L, 63130);
    int i = i.m.pUO;
    GMTrace.o(8473165168640L, 63130);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8473702039552L, 63134);
    w.i("MicroMsg.SnsPermissionUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " " + paramk.getType());
    if (paramk.getType() == 291)
    {
      paramString = new StringBuilder("tipDialog ");
      if (this.ikZ != null) {
        break label156;
      }
    }
    label156:
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.SnsPermissionUI", bool);
      if (this.ikZ != null)
      {
        this.ikZ.dismiss();
        this.ikZ = null;
      }
      bcT();
      if (this.qMs) {
        this.qMt = true;
      }
      GMTrace.o(8473702039552L, 63134);
      return;
    }
  }
  
  public final boolean a(final f paramf, Preference paramPreference)
  {
    GMTrace.i(8473836257280L, 63135);
    paramf = paramPreference.iay;
    if (paramf.equals("sns_outside_permiss"))
    {
      paramf = new pj();
      paramf.fNk.fNm = true;
      paramf.fNk.fNl = false;
      paramf.fNk.username = this.userName;
      com.tencent.mm.sdk.b.a.uLm.m(paramf);
      if (this.qMr.vk()) {
        o.k(this.qMr);
      }
      for (;;)
      {
        GMTrace.o(8473836257280L, 63135);
        return true;
        o.j(this.qMr);
      }
    }
    if (paramf.equals("sns_black_permiss"))
    {
      paramf = new pj();
      paramf.fNk.fNm = false;
      paramf.fNk.fNl = true;
      paramf.fNk.username = this.userName;
      com.tencent.mm.sdk.b.a.uLm.m(paramf);
      boolean bool = Io(this.userName);
      paramf = this.userName;
      int i;
      if (bool)
      {
        i = 2;
        if ((i != 1) || (5L != 5L)) {
          break label304;
        }
        this.qMs = true;
      }
      for (this.qMt = false;; this.qMt = false)
      {
        paramPreference = new LinkedList();
        paramPreference.add(paramf);
        paramf = new v(i, 5L, "", paramPreference.size(), paramPreference, this.scene);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(paramf, 0);
        getString(i.j.dxm);
        this.ikZ = com.tencent.mm.ui.base.h.a(this, getString(i.j.pTR), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(8551011450880L, 63710);
            SnsPermissionUI.a(SnsPermissionUI.this);
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.c(paramf);
            GMTrace.o(8551011450880L, 63710);
          }
        });
        GMTrace.o(8473836257280L, 63135);
        return true;
        i = 1;
        break;
        label304:
        this.qMs = false;
      }
    }
    GMTrace.o(8473836257280L, 63135);
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(8472896733184L, 63128);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      w.d("MicroMsg.SnsPermissionUI", "dispatchKeyEvent");
      setResult(-1, new Intent());
      finish();
      GMTrace.o(8472896733184L, 63128);
      return true;
    }
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(8472896733184L, 63128);
    return bool;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8472762515456L, 63127);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(291, this);
    this.userName = getIntent().getStringExtra("sns_permission_userName");
    this.qMq = getIntent().getBooleanExtra("sns_permission_anim", false);
    this.qMu = getIntent().getLongExtra("sns_permission_snsinfo_svr_id", 0L);
    this.scene = getIntent().getIntExtra("sns_permission_block_scene", 0);
    w.d("MicroMsg.SnsPermissionUI", "SnsPermissionUI, scene:%d", new Object[] { Integer.valueOf(this.scene) });
    com.tencent.mm.kernel.h.xA();
    this.qMr = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(this.userName);
    if (this.qMr == null)
    {
      w.e("MicroMsg.SnsPermissionUI", "the error cause by get contact by %s", new Object[] { this.userName });
      finish();
    }
    this.qMr.setUsername(this.userName);
    MH();
    GMTrace.o(8472762515456L, 63127);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8473030950912L, 63129);
    super.onDestroy();
    com.tencent.mm.plugin.sns.c.a.ifN.pt();
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.b(291, this);
    if ((this.qMu != 0L) && (this.qMu != -1L))
    {
      oy localoy = new oy();
      localoy.fMV.fMW = this.qMt;
      localoy.fMV.fCk = this.qMu;
      com.tencent.mm.sdk.b.a.uLm.m(localoy);
    }
    GMTrace.o(8473030950912L, 63129);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsPermissionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */