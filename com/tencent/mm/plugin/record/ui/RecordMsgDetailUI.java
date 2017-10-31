package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.pluginsdk.model.app.ab;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sq;
import com.tencent.mm.protocal.c.sr;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;

public class RecordMsgDetailUI
  extends RecordMsgBaseUI
{
  private boolean fHE;
  private String fKr;
  private long fxK;
  private q iXW;
  private com.tencent.mm.protocal.b.a.c oUS;
  private boolean oUT;
  private String oUU;
  private String oUV;
  private String title;
  
  public RecordMsgDetailUI()
  {
    GMTrace.i(7560081965056L, 56327);
    this.oUS = null;
    this.fxK = -1L;
    this.fKr = null;
    this.fHE = true;
    this.oUT = false;
    this.title = "";
    this.oUU = "";
    this.oUV = "";
    this.iXW = null;
    GMTrace.o(7560081965056L, 56327);
  }
  
  private String a(com.tencent.mm.protocal.b.a.c paramc)
  {
    com.tencent.mm.protocal.b.a.c localc = null;
    GMTrace.i(16878953037824L, 125758);
    int i;
    String str2;
    String str1;
    if (paramc != null)
    {
      Iterator localIterator = paramc.hdL.iterator();
      i = 0;
      str2 = null;
      str1 = null;
      while (localIterator.hasNext())
      {
        paramc = (sp)localIterator.next();
        if (paramc.tPr.tPJ.tQf != null)
        {
          str1 = this.vov.voR.getString(R.l.exd);
          i = 1;
        }
        else
        {
          if (paramc.tPr.tPJ.fFB == null) {
            break label238;
          }
          if (str2 == null)
          {
            str2 = paramc.tPt;
          }
          else
          {
            if (str2 == paramc.tPt) {
              break label238;
            }
            paramc = paramc.tPt;
            localc = paramc;
          }
        }
      }
      if ((str2 != null) && (localc == null) && (i == 0)) {
        paramc = this.vov.voR.getString(R.l.dXC, new Object[] { str2 });
      }
    }
    for (;;)
    {
      GMTrace.o(16878953037824L, 125758);
      return paramc;
      paramc = str1;
      if (str2 != null)
      {
        paramc = str1;
        if (localc != null)
        {
          paramc = str1;
          if (str2 != localc)
          {
            paramc = str1;
            if (i == 0)
            {
              paramc = this.vov.voR.getString(R.l.dXB, new Object[] { str2, localc });
              continue;
              label238:
              paramc = localc;
              break;
              paramc = null;
            }
          }
        }
      }
    }
  }
  
  private void ar()
  {
    GMTrace.i(16879087255552L, 125759);
    f localf = new f();
    localf.oUt = this.oUS.hdL;
    localf.fxK = this.fxK;
    localf.fKr = this.fKr;
    super.aZm();
    this.oUP.a(localf);
    s.aZh().a((e)this.oUP);
    GMTrace.o(16879087255552L, 125759);
  }
  
  protected final void aZm()
  {
    GMTrace.i(7560350400512L, 56329);
    this.fxK = getIntent().getLongExtra("message_id", -1L);
    this.fKr = getIntent().getStringExtra("record_xml");
    this.fHE = getIntent().getBooleanExtra("record_show_share", true);
    this.oUT = getIntent().getBooleanExtra("big_appmsg", false);
    this.oUS = com.tencent.mm.plugin.record.a.m.EH(this.fKr);
    if (this.oUS != null) {
      if (a(this.oUS) != null)
      {
        this.title = a(this.oUS);
        if (!bg.bX(this.oUS.hdL))
        {
          this.oUU = ((sp)this.oUS.hdL.getFirst()).tPv;
          this.oUV = ((sp)this.oUS.hdL.getLast()).tPv;
        }
      }
    }
    for (;;)
    {
      if ((this.fKr != null) && (this.oUS != null)) {
        break label348;
      }
      aZu();
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7535251685376L, 56142);
          RecordMsgDetailUI.this.finish();
          GMTrace.o(7535251685376L, 56142);
          return true;
        }
      });
      if ((this.oUT) && (an.afn().el(this.fxK) != null))
      {
        ap.AS();
        localObject = com.tencent.mm.x.c.yN().cI(this.fxK);
        localObject = new ab(this.fxK, ((ce)localObject).field_msgSvrId, new com.tencent.mm.ac.f()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, k paramAnonymousk)
          {
            GMTrace.i(16877610860544L, 125748);
            if (paramAnonymousInt1 == paramAnonymousInt2)
            {
              if (RecordMsgDetailUI.a(RecordMsgDetailUI.this) != null)
              {
                RecordMsgDetailUI.a(RecordMsgDetailUI.this).dismiss();
                RecordMsgDetailUI.b(RecordMsgDetailUI.this);
              }
              ap.AS();
              au localau = com.tencent.mm.x.c.yN().cI(RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              paramAnonymousk = localau.field_content;
              if (o.dW(localau.field_talker)) {
                paramAnonymousk = ay.gA(localau.field_content);
              }
              paramAnonymousk = f.a.eC(paramAnonymousk);
              if (paramAnonymousk != null)
              {
                RecordMsgDetailUI.a(RecordMsgDetailUI.this, paramAnonymousk.hbp);
                RecordMsgDetailUI.a(RecordMsgDetailUI.this, com.tencent.mm.plugin.record.a.m.EH(RecordMsgDetailUI.d(RecordMsgDetailUI.this)));
                if (RecordMsgDetailUI.e(RecordMsgDetailUI.this) != null)
                {
                  if (RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)) == null) {
                    break label246;
                  }
                  RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)));
                }
              }
            }
            for (;;)
            {
              RecordMsgDetailUI.c(RecordMsgDetailUI.this, ((sp)RecordMsgDetailUI.e(RecordMsgDetailUI.this).hdL.getFirst()).tPv);
              RecordMsgDetailUI.d(RecordMsgDetailUI.this, ((sp)RecordMsgDetailUI.e(RecordMsgDetailUI.this).hdL.getLast()).tPv);
              RecordMsgDetailUI.f(RecordMsgDetailUI.this);
              GMTrace.o(16877610860544L, 125748);
              return;
              label246:
              RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this).title);
            }
          }
        });
        ap.wT().a((k)localObject, 0);
      }
      GMTrace.o(7560350400512L, 56329);
      return;
      this.title = this.oUS.title;
      break;
      ap.AS();
      Object localObject = com.tencent.mm.x.c.yN().cI(this.fxK);
      localObject = f.a.B(((ce)localObject).field_content, ((ce)localObject).field_reserved);
      if (localObject != null)
      {
        this.title = ((f.a)localObject).title;
        this.iXW = q.b(this, getString(R.l.bUo), true, 0, null);
      }
    }
    label348:
    ar();
    GMTrace.o(7560350400512L, 56329);
  }
  
  protected final h aZn()
  {
    GMTrace.i(7560484618240L, 56330);
    e locale = new e(this, new g());
    GMTrace.o(7560484618240L, 56330);
    return locale;
  }
  
  protected final String aZo()
  {
    GMTrace.i(7560753053696L, 56332);
    String str = this.title;
    GMTrace.o(7560753053696L, 56332);
    return str;
  }
  
  protected final String aZp()
  {
    GMTrace.i(7560887271424L, 56333);
    String str = this.oUU;
    GMTrace.o(7560887271424L, 56333);
    return str;
  }
  
  protected final String aZq()
  {
    GMTrace.i(7561021489152L, 56334);
    String str = this.oUV;
    GMTrace.o(7561021489152L, 56334);
    return str;
  }
  
  protected final void aZr()
  {
    GMTrace.i(7561155706880L, 56335);
    if (!this.fHE)
    {
      GMTrace.o(7561155706880L, 56335);
      return;
    }
    a(0, R.g.baG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16878818820096L, 125757);
        paramAnonymousMenuItem = new com.tencent.mm.ui.widget.e(RecordMsgDetailUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
        paramAnonymousMenuItem.qQS = new o.c()
        {
          public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
          {
            GMTrace.i(16878550384640L, 125755);
            paramAnonymous2m.e(0, RecordMsgDetailUI.this.getString(R.l.dXS));
            paramAnonymous2m.e(2, RecordMsgDetailUI.this.getString(R.l.euj));
            GMTrace.o(16878550384640L, 125755);
          }
        };
        paramAnonymousMenuItem.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(16878013513728L, 125751);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(16878013513728L, 125751);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 10);
              paramAnonymous2MenuItem.putExtra("Retr_Msg_Id", RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              d.a(RecordMsgDetailUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1001);
              GMTrace.o(16878013513728L, 125751);
              return;
              GMTrace.o(16878013513728L, 125751);
              return;
              paramAnonymous2MenuItem = new cd();
              com.tencent.mm.pluginsdk.model.e.a(paramAnonymous2MenuItem, RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              paramAnonymous2MenuItem.fwt.fwA = 9;
              paramAnonymous2MenuItem.fwt.activity = RecordMsgDetailUI.this;
              a.uLm.m(paramAnonymous2MenuItem);
            }
          }
        };
        paramAnonymousMenuItem.bCV();
        GMTrace.o(16878818820096L, 125757);
        return true;
      }
    });
    GMTrace.o(7561155706880L, 56335);
  }
  
  protected final void b(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(7561289924608L, 56336);
    if (-1 != paramInt2)
    {
      w.e("MicroMsg.RecordMsgDetailUI", "processResult %d", new Object[] { Integer.valueOf(paramInt2) });
      GMTrace.o(7561289924608L, 56336);
      return;
    }
    final Object localObject;
    if (1001 == paramInt1)
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label103;
        }
      }
      label103:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        if (!bg.mZ((String)localObject)) {
          break label114;
        }
        w.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
        GMTrace.o(7561289924608L, 56336);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label114:
      ap.AS();
      final au localau = com.tencent.mm.x.c.yN().cI(this.fxK);
      if (localau.field_msgId != this.fxK)
      {
        w.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
        GMTrace.o(7561289924608L, 56336);
        return;
      }
      final q localq = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dWT), false, null);
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16880966303744L, 125773);
          com.tencent.mm.plugin.record.a.m.a(localObject, paramIntent, localau);
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(16878281949184L, 125753);
              RecordMsgDetailUI.4.this.lRz.dismiss();
              GMTrace.o(16878281949184L, 125753);
            }
          });
          GMTrace.o(16880966303744L, 125773);
        }
        
        public final String toString()
        {
          GMTrace.i(16881100521472L, 125774);
          String str = super.toString() + "|onActivityResult";
          GMTrace.o(16881100521472L, 125774);
          return str;
        }
      });
      GMTrace.o(7561289924608L, 56336);
      return;
    }
    if ((1002 == paramInt1) && (paramIntent.getBooleanExtra("kfavorite", false)))
    {
      localObject = new cd();
      com.tencent.mm.pluginsdk.model.e.a((cd)localObject, paramIntent);
      ((cd)localObject).fwt.activity = this;
      ((cd)localObject).fwt.fwA = 8;
      a.uLm.m((b)localObject);
    }
    GMTrace.o(7561289924608L, 56336);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7560216182784L, 56328);
    super.onCreate(paramBundle);
    GMTrace.o(7560216182784L, 56328);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7560618835968L, 56331);
    super.onDestroy();
    s.aZh().b((e)this.oUP);
    GMTrace.o(7560618835968L, 56331);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */