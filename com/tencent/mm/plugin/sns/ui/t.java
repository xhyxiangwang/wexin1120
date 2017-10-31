package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.df;
import com.tencent.mm.g.a.df.b;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.pu;
import com.tencent.mm.plugin.sns.data.SnsCmdList;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ac;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.am;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.widget.e.a;
import java.util.ArrayList;
import java.util.List;

public final class t
  implements com.tencent.mm.ac.e
{
  public final Context context;
  public int fwh;
  public int fwi;
  public com.tencent.mm.ui.base.q ikZ;
  public int jXL;
  c lRF;
  public com.tencent.mm.plugin.sns.storage.m pFU;
  public String qAW;
  public String qAZ;
  SnsCmdList qBC;
  private final a qBD;
  public com.tencent.mm.ui.widget.e qBE;
  public amn qBF;
  private final String qBG;
  public boolean qBa;
  c qBc;
  public boolean qyZ;
  public String ub;
  
  public t(Context paramContext, a parama)
  {
    GMTrace.i(8556245942272L, 63749);
    this.qBC = new SnsCmdList();
    this.ikZ = null;
    this.jXL = 0;
    this.qBE = null;
    this.qBa = false;
    this.lRF = new c() {};
    this.qBc = new c() {};
    this.context = paramContext;
    this.qBD = parama;
    this.qBG = ((Activity)paramContext).getIntent().getStringExtra("sns_gallery_pre_title");
    GMTrace.o(8556245942272L, 63749);
  }
  
  public static void If(String paramString)
  {
    GMTrace.i(16045058293760L, 119545);
    pu localpu = new pu();
    localpu.fNB.fAI = 1;
    localpu.fNB.fNE = 2;
    localpu.fNB.fAx = paramString;
    com.tencent.mm.sdk.b.a.uLm.m(localpu);
    GMTrace.o(16045058293760L, 119545);
  }
  
  public static void Ig(String paramString)
  {
    GMTrace.i(16045192511488L, 119546);
    pu localpu = new pu();
    localpu.fNB.fAI = 3;
    localpu.fNB.fAx = paramString;
    com.tencent.mm.sdk.b.a.uLm.m(localpu);
    GMTrace.o(16045192511488L, 119546);
  }
  
  protected final void A(final com.tencent.mm.plugin.sns.storage.m paramm)
  {
    GMTrace.i(8556648595456L, 63752);
    if ((paramm.bkh()) || (paramm.bki()))
    {
      ae.bhp().uJ(paramm.quQ);
      this.qBC.tP(paramm.quQ);
      GMTrace.o(8556648595456L, 63752);
      return;
    }
    ae.bho().dB(paramm.field_snsId);
    paramm = new com.tencent.mm.plugin.sns.model.q(paramm.field_snsId, 1);
    com.tencent.mm.kernel.h.xA();
    com.tencent.mm.kernel.h.xy().gQO.a(paramm, 0);
    Context localContext = this.context;
    this.context.getString(i.j.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a(localContext, this.context.getString(i.j.pRU), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(8493700481024L, 63283);
        if (t.this.jXL != 0)
        {
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.c(paramm);
          t.this.jXL = 0;
        }
        GMTrace.o(8493700481024L, 63283);
      }
    });
    GMTrace.o(8556648595456L, 63752);
  }
  
  public final void F(Bundle paramBundle)
  {
    GMTrace.i(16145184718848L, 120291);
    w.i("MicroMsg.GalleryTitleManager", "request deal QBAR string");
    by localby = new by();
    localby.fwg.activity = ((Activity)this.context);
    localby.fwg.fuE = this.qAZ;
    localby.fwg.fwh = this.fwh;
    localby.fwg.fwi = this.fwi;
    localby.fwg.fwn = paramBundle;
    com.tencent.mm.sdk.b.a.uLm.m(localby);
    GMTrace.o(16145184718848L, 120291);
  }
  
  protected final void Ie(String paramString)
  {
    GMTrace.i(8556782813184L, 63753);
    Intent localIntent = new Intent();
    localIntent.putExtra("Retr_File_Name", paramString);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localIntent.putExtra("Retr_Msg_Type", 0);
    com.tencent.mm.plugin.sns.c.a.ifM.l(localIntent, this.context);
    GMTrace.o(8556782813184L, 63753);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(8556917030912L, 63754);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramk == null))
    {
      GMTrace.o(8556917030912L, 63754);
      return;
    }
    w.i("MicroMsg.GalleryTitleManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    if (this.ikZ != null) {
      this.ikZ.dismiss();
    }
    paramString = (com.tencent.mm.plugin.sns.model.q)paramk;
    switch (paramString.type)
    {
    }
    for (;;)
    {
      GMTrace.o(8556917030912L, 63754);
      return;
      this.qBC.tP(paramString.pYt);
      this.qBD.bU(u.W("sns_table_", paramString.pYt), paramString.type);
      GMTrace.o(8556917030912L, 63754);
      return;
      this.qBC.tQ(paramString.pYt);
      this.qBD.bU("", paramString.type);
      GMTrace.o(8556917030912L, 63754);
      return;
      this.qBD.bU("", paramString.type);
      GMTrace.o(8556917030912L, 63754);
      return;
      this.qBC.tQ(paramString.pYt);
      this.qBD.bU(u.W("sns_table_", paramString.pYt), paramString.type);
    }
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.m paramm, amn paramamn)
  {
    GMTrace.i(16044789858304L, 119543);
    if (paramm == null)
    {
      w.i("MicroMsg.GalleryTitleManager", "error beacause info null");
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    if (paramm.field_type == 1)
    {
      cd localcd = new cd();
      com.tencent.mm.plugin.sns.i.a.a(localcd, paramm, paramamn.nas);
      localcd.fwt.activity = ((Activity)this.context);
      localcd.fwt.fwA = 15;
      com.tencent.mm.sdk.b.a.uLm.m(localcd);
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    if (paramm == null)
    {
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    if (!paramm.uF(32))
    {
      paramm = paramm.bkg();
      paramamn = new pu();
      paramamn.fNB.fAI = 2;
      paramamn.fNB.fNC = 16;
      paramamn.fNB.fND = false;
      paramamn.fNB.fAx = paramm;
      com.tencent.mm.sdk.b.a.uLm.m(paramamn);
      GMTrace.o(16044789858304L, 119543);
      return;
    }
    paramamn = new cd();
    com.tencent.mm.plugin.sns.i.a.a(paramamn, paramm);
    paramamn.fwt.activity = ((Activity)this.context);
    paramamn.fwt.fwA = 16;
    com.tencent.mm.sdk.b.a.uLm.m(paramamn);
    GMTrace.o(16044789858304L, 119543);
  }
  
  public final void a(com.tencent.mm.plugin.sns.storage.m paramm, amn paramamn, int paramInt)
  {
    GMTrace.i(16044655640576L, 119542);
    if (paramm == null)
    {
      w.e("MicroMsg.GalleryTitleManager", "error beacause info null");
      GMTrace.o(16044655640576L, 119542);
      return;
    }
    Intent localIntent = new Intent();
    if (paramm.field_type == 1)
    {
      String str = paramamn.nas;
      localIntent.putExtra("sns_send_data_ui_image_path", FlipView.f(am.dt(ae.getAccSnsPath(), str) + com.tencent.mm.plugin.sns.data.i.l(paramamn), this.context));
      localIntent.putExtra("sns_send_data_ui_image_position", paramInt);
    }
    localIntent.putExtra("sns_send_data_ui_activity", true);
    localIntent.putExtra("sns_local_id", paramm.bkg());
    d.a(this.context, ".ui.chatting.ChattingSendDataToDeviceUI", localIntent);
    GMTrace.o(16044655640576L, 119542);
  }
  
  public final void a(boolean paramBoolean1, final com.tencent.mm.plugin.sns.storage.m paramm, final amn paramamn, boolean paramBoolean2, final int paramInt)
  {
    GMTrace.i(8556514377728L, 63751);
    this.qyZ = paramBoolean1;
    this.pFU = paramm;
    this.qBF = paramamn;
    this.ub = paramamn.nas;
    final ArrayList localArrayList1 = new ArrayList();
    final ArrayList localArrayList2 = new ArrayList();
    label244:
    Object localObject;
    if (paramBoolean1)
    {
      if (paramm == null)
      {
        GMTrace.o(8556514377728L, 63751);
        return;
      }
      if (paramm.field_localPrivate > 0)
      {
        if ((!bg.mZ(ae.bgV())) && (ae.bgV().equals(paramm.field_userName)))
        {
          localArrayList1.add(this.context.getString(i.j.pTF));
          localArrayList2.add(Integer.valueOf(5));
        }
        localArrayList1.add(this.context.getString(i.j.eLC));
        localArrayList2.add(Integer.valueOf(3));
        if (d.KT("favorite"))
        {
          localArrayList1.add(this.context.getString(i.j.euj));
          localArrayList2.add(Integer.valueOf(6));
        }
        if ((paramm.field_type != 15) && (paramm.field_type != 5)) {
          break label606;
        }
        localArrayList1.add(this.context.getString(i.j.eCW));
        localArrayList2.add(Integer.valueOf(2));
        localObject = new df();
        ((df)localObject).fxU.fxL = paramm.bkg();
        com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
        if (((df)localObject).fxV.fxs)
        {
          localArrayList1.add(this.context.getString(i.j.pQV));
          localArrayList2.add(Integer.valueOf(8));
        }
        if (this.qAZ != null)
        {
          if (!com.tencent.mm.plugin.scanner.a.al(this.fwh, this.qAZ)) {
            break label680;
          }
          localObject = this.context.getString(i.j.ewZ);
          label349:
          localArrayList1.add(localObject);
          localArrayList2.add(Integer.valueOf(7));
        }
        if ((this.qBE == null) || (!this.qBa)) {
          break label695;
        }
        this.qBa = false;
        label391:
        this.qBE.qQS = new o.c()
        {
          public final void a(com.tencent.mm.ui.base.m paramAnonymousm)
          {
            GMTrace.i(8707375104000L, 64875);
            paramAnonymousm.clear();
            int i = 0;
            while (i < localArrayList1.size())
            {
              paramAnonymousm.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
              i += 1;
            }
            paramAnonymousm.e(-1, t.this.context.getString(i.j.pRT));
            GMTrace.o(8707375104000L, 64875);
          }
        };
        this.qBE.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            GMTrace.i(8493432045568L, 63281);
            paramAnonymousInt = paramAnonymousMenuItem.getItemId();
            w.d("MicroMsg.GalleryTitleManager", "showAlertWithDel " + paramAnonymousInt);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(8493432045568L, 63281);
              return;
              if ((paramm != null) && (paramm.bjL().uyu != null))
              {
                t.this.a(paramm, paramamn);
                GMTrace.o(8493432045568L, 63281);
                return;
                t.this.a(paramm, paramamn, paramInt);
                GMTrace.o(8493432045568L, 63281);
                return;
                paramAnonymousMenuItem = t.this;
                Object localObject = new com.tencent.mm.plugin.sns.model.q(paramm.field_snsId, 3);
                com.tencent.mm.kernel.h.xA();
                com.tencent.mm.kernel.h.xy().gQO.a((com.tencent.mm.ac.k)localObject, 0);
                Context localContext = paramAnonymousMenuItem.context;
                paramAnonymousMenuItem.context.getString(i.j.dxm);
                paramAnonymousMenuItem.ikZ = com.tencent.mm.ui.base.h.a(localContext, paramAnonymousMenuItem.context.getString(i.j.pTD), true, new t.9(paramAnonymousMenuItem, (com.tencent.mm.plugin.sns.model.q)localObject));
                GMTrace.o(8493432045568L, 63281);
                return;
                paramAnonymousMenuItem = t.this;
                localObject = paramm;
                if ((((com.tencent.mm.plugin.sns.storage.m)localObject).bkh()) || (((com.tencent.mm.plugin.sns.storage.m)localObject).bki()))
                {
                  ae.bhp().uJ(((com.tencent.mm.plugin.sns.storage.m)localObject).quQ);
                  GMTrace.o(8493432045568L, 63281);
                  return;
                }
                localObject = new com.tencent.mm.plugin.sns.model.q(((com.tencent.mm.plugin.sns.storage.m)localObject).field_snsId, 2);
                com.tencent.mm.kernel.h.xA();
                com.tencent.mm.kernel.h.xy().gQO.a((com.tencent.mm.ac.k)localObject, 0);
                localContext = paramAnonymousMenuItem.context;
                paramAnonymousMenuItem.context.getString(i.j.dxm);
                paramAnonymousMenuItem.ikZ = com.tencent.mm.ui.base.h.a(localContext, paramAnonymousMenuItem.context.getString(i.j.pTD), true, new t.8(paramAnonymousMenuItem, (com.tencent.mm.plugin.sns.model.q)localObject));
                GMTrace.o(8493432045568L, 63281);
                return;
                if ((paramm != null) && (paramm.bjL().uyu != null))
                {
                  if (paramm.field_type != 15)
                  {
                    com.tencent.mm.pluginsdk.ui.tools.k.h(am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.l(paramamn), t.this.context);
                    GMTrace.o(8493432045568L, 63281);
                    return;
                  }
                  t.Ig(paramm.bkg());
                  GMTrace.o(8493432045568L, 63281);
                  return;
                  if ((paramm != null) && (paramm.bjL().uyu != null))
                  {
                    if (paramm.bjL().uyu.tKc == 1)
                    {
                      paramAnonymousMenuItem = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.l(paramamn);
                      t.this.Ie(paramAnonymousMenuItem);
                      GMTrace.o(8493432045568L, 63281);
                      return;
                    }
                    t.If(paramm.bkg());
                    GMTrace.o(8493432045568L, 63281);
                    return;
                    paramAnonymousMenuItem = new Bundle();
                    paramAnonymousMenuItem.putString("stat_msg_id", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(paramm.field_snsId));
                    paramAnonymousMenuItem.putString("stat_send_msg_user", paramm.field_userName);
                    paramAnonymousMenuItem.putInt("stat_scene", 3);
                    t.this.F(paramAnonymousMenuItem);
                    GMTrace.o(8493432045568L, 63281);
                    return;
                    if (paramm.bjL().uyu.tKd.size() > 1)
                    {
                      com.tencent.mm.ui.base.h.a(t.this.context, t.this.context.getString(i.j.pTq), "", new DialogInterface.OnClickListener()
                      {
                        public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                        {
                          GMTrace.i(8722944360448L, 64991);
                          t.this.A(t.3.this.qBK);
                          GMTrace.o(8722944360448L, 64991);
                        }
                      }, null);
                      GMTrace.o(8493432045568L, 63281);
                      return;
                    }
                    com.tencent.mm.ui.base.h.a(t.this.context, t.this.context.getString(i.j.pTo), "", new DialogInterface.OnClickListener()
                    {
                      public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                      {
                        GMTrace.i(8533428928512L, 63579);
                        t.this.A(t.3.this.qBK);
                        GMTrace.o(8533428928512L, 63579);
                      }
                    }, null);
                  }
                }
              }
            }
          }
        };
        this.qBE.wTa = new e.a()
        {
          public final void onDismiss()
          {
            GMTrace.i(14707041763328L, 109576);
            Object localObject = new al();
            ((al)localObject).fuF.filePath = t.this.qAW;
            com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
            t.this.qBE = null;
            t.this.qAW = null;
            t.this.pFU = null;
            t.this.ub = null;
            t.this.qAZ = null;
            localObject = t.this;
            t.this.fwi = 0;
            ((t)localObject).fwh = 0;
            GMTrace.o(14707041763328L, 109576);
          }
        };
        this.qBE.bCV();
      }
    }
    label606:
    label680:
    label695:
    label839:
    label944:
    do
    {
      if (true == paramBoolean2)
      {
        com.tencent.mm.kernel.h.xA();
        if (com.tencent.mm.kernel.h.xy().gQO.DN() != 0)
        {
          paramm = new mc();
          paramamn = am.dt(ae.getAccSnsPath(), this.ub) + com.tencent.mm.plugin.sns.data.i.l(paramamn);
          paramm.fKl.filePath = paramamn;
          this.qAW = paramamn;
          com.tencent.mm.sdk.b.a.uLm.m(paramm);
        }
      }
      GMTrace.o(8556514377728L, 63751);
      return;
      localArrayList1.add(this.context.getString(i.j.pTG));
      localArrayList2.add(Integer.valueOf(1));
      localArrayList1.add(this.context.getString(i.j.eLC));
      localArrayList2.add(Integer.valueOf(3));
      break;
      if (paramm.field_type == 1)
      {
        localArrayList1.add(this.context.getString(i.j.eCT));
        localArrayList2.add(Integer.valueOf(2));
        break label244;
      }
      localArrayList1.add(this.context.getString(i.j.pTA));
      localArrayList2.add(Integer.valueOf(2));
      break label244;
      localObject = this.context.getString(i.j.ewY);
      break label349;
      this.qBE = new com.tencent.mm.ui.widget.e(this.context, com.tencent.mm.ui.widget.e.wSP, false);
      break label391;
      paramm.bjL();
      localArrayList1.add(this.context.getString(i.j.eLC));
      localArrayList2.add(Integer.valueOf(3));
      if (d.KT("favorite"))
      {
        localArrayList1.add(this.context.getString(i.j.euj));
        localArrayList2.add(Integer.valueOf(6));
      }
      if ((paramm.field_type != 15) && (paramm.field_type != 5)) {
        break label1044;
      }
      localArrayList1.add(this.context.getString(i.j.eCW));
      localArrayList2.add(Integer.valueOf(2));
      localObject = new df();
      ((df)localObject).fxU.fxL = paramm.bkg();
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      if (((df)localObject).fxV.fxs)
      {
        localArrayList1.add(this.context.getString(i.j.pQV));
        localArrayList2.add(Integer.valueOf(8));
      }
      if (this.qAZ != null)
      {
        if (!com.tencent.mm.plugin.scanner.a.al(this.fwh, this.qAZ)) {
          break label1118;
        }
        localObject = this.context.getString(i.j.ewZ);
        localArrayList1.add(localObject);
        localArrayList2.add(Integer.valueOf(7));
      }
    } while (localArrayList1.size() == 0);
    if ((this.qBE != null) && (this.qBa)) {
      this.qBa = false;
    }
    for (;;)
    {
      this.qBE.qQS = new o.c()
      {
        public final void a(com.tencent.mm.ui.base.m paramAnonymousm)
        {
          GMTrace.i(8391829225472L, 62524);
          paramAnonymousm.clear();
          int i = 0;
          while (i < localArrayList1.size())
          {
            paramAnonymousm.e(((Integer)localArrayList2.get(i)).intValue(), (CharSequence)localArrayList1.get(i));
            i += 1;
          }
          GMTrace.o(8391829225472L, 62524);
        }
      };
      this.qBE.qQT = new o.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(8613288476672L, 64174);
          paramAnonymousInt = paramAnonymousMenuItem.getItemId();
          w.d("MicroMsg.GalleryTitleManager", "showAlert " + paramAnonymousInt);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(8613288476672L, 64174);
            return;
            if ((paramm != null) && (paramm.bjL().uyu != null))
            {
              t.this.a(paramm, paramamn);
              GMTrace.o(8613288476672L, 64174);
              return;
              t.this.a(paramm, paramamn, paramInt);
              GMTrace.o(8613288476672L, 64174);
              return;
              if ((paramm != null) && (paramm.bjL().uyu != null))
              {
                if (paramm.bjL().uyu.tKc == 1)
                {
                  paramAnonymousMenuItem = am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.l(paramamn);
                  t.this.Ie(paramAnonymousMenuItem);
                  GMTrace.o(8613288476672L, 64174);
                  return;
                }
                t.If(paramm.bkg());
                GMTrace.o(8613288476672L, 64174);
                return;
                if ((paramm != null) && (paramm.bjL().uyu != null))
                {
                  if (paramm.field_type != 15)
                  {
                    com.tencent.mm.pluginsdk.ui.tools.k.h(am.dt(ae.getAccSnsPath(), paramamn.nas) + com.tencent.mm.plugin.sns.data.i.l(paramamn), t.this.context);
                    GMTrace.o(8613288476672L, 64174);
                    return;
                  }
                  t.Ig(paramm.bkg());
                  GMTrace.o(8613288476672L, 64174);
                  return;
                  paramAnonymousMenuItem = t.this;
                  long l = paramm.field_snsId;
                  com.tencent.mm.plugin.sns.storage.m localm = ae.bhp().dP(l);
                  if ((l == 0L) || (localm == null))
                  {
                    GMTrace.o(8613288476672L, 64174);
                    return;
                  }
                  Intent localIntent = new Intent();
                  localIntent.putExtra("k_username", localm.field_userName);
                  localIntent.putExtra("k_expose_msg_id", l);
                  localIntent.putExtra("showShare", false);
                  localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
                  d.b(paramAnonymousMenuItem.context, "webview", ".ui.tools.WebViewUI", localIntent);
                  GMTrace.o(8613288476672L, 64174);
                  return;
                  paramAnonymousMenuItem = new Bundle();
                  paramAnonymousMenuItem.putString("stat_msg_id", "sns_" + com.tencent.mm.plugin.sns.data.i.jdMethod_do(paramm.field_snsId));
                  paramAnonymousMenuItem.putString("stat_send_msg_user", paramm.field_userName);
                  paramAnonymousMenuItem.putInt("stat_scene", 3);
                  t.this.F(paramAnonymousMenuItem);
                }
              }
            }
          }
        }
      };
      this.qBE.bCV();
      break;
      label1044:
      if (paramm.field_type == 1)
      {
        localArrayList1.add(this.context.getString(i.j.eCT));
        localArrayList2.add(Integer.valueOf(2));
        break label839;
      }
      localArrayList1.add(this.context.getString(i.j.pTA));
      localArrayList2.add(Integer.valueOf(2));
      break label839;
      label1118:
      localObject = this.context.getString(i.j.ewY);
      break label944;
      this.qBE = new com.tencent.mm.ui.widget.e(this.context, com.tencent.mm.ui.widget.e.wSP, false);
    }
  }
  
  public final void blD()
  {
    GMTrace.i(8556380160000L, 63750);
    Intent localIntent = new Intent();
    localIntent.putExtra("sns_cmd_list", this.qBC);
    ((Activity)this.context).setResult(-1, localIntent);
    ((Activity)this.context).finish();
    GMTrace.o(8556380160000L, 63750);
  }
  
  public final void uL(int paramInt)
  {
    GMTrace.i(8556111724544L, 63748);
    if (paramInt == 0)
    {
      GMTrace.o(8556111724544L, 63748);
      return;
    }
    this.qBC.tP(paramInt);
    GMTrace.o(8556111724544L, 63748);
  }
  
  public static abstract interface a
  {
    public abstract void aha();
    
    public abstract void bU(String paramString, int paramInt);
    
    public abstract void bV(String paramString, int paramInt);
    
    public abstract void blE();
    
    public abstract void dE(String paramString1, String paramString2);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */