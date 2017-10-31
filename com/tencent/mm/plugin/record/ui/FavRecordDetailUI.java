package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.e;
import com.tencent.mm.x.n;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavRecordDetailUI
  extends RecordMsgBaseUI
{
  private boolean fHE;
  private String lUt;
  private long lWj;
  private com.tencent.mm.plugin.record.a.c oUA;
  private boolean oUB;
  private com.tencent.mm.sdk.b.c oUC;
  
  public FavRecordDetailUI()
  {
    GMTrace.i(7551760465920L, 56265);
    this.lWj = -1L;
    this.fHE = true;
    this.lUt = String.valueOf(this.lWj);
    this.oUB = true;
    this.oUC = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7551760465920L, 56265);
  }
  
  protected final void aZm()
  {
    GMTrace.i(7552028901376L, 56267);
    this.lWj = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.fHE = getIntent().getBooleanExtra("show_share", true);
    this.oUA = com.tencent.mm.plugin.record.a.d.cZ(this.lWj);
    this.lUt = String.valueOf(this.lWj);
    if (this.oUA == null)
    {
      finish();
      GMTrace.o(7552028901376L, 56267);
      return;
    }
    b localb = new b();
    localb.oUu = this.oUA;
    localb.oUt = this.oUA.field_favProto.tQC;
    Object localObject = localb.oUt;
    if (localObject == null) {
      this.oUB = false;
    }
    for (;;)
    {
      super.aZm();
      this.oUP.a(localb);
      com.tencent.mm.sdk.b.a.uLm.b(this.oUC);
      com.tencent.mm.sdk.b.a.uLm.b(((d)this.oUP).oUw);
      GMTrace.o(7552028901376L, 56267);
      return;
      if (((List)localObject).size() == 0)
      {
        this.oUB = false;
      }
      else
      {
        localObject = ((List)localObject).iterator();
        for (;;)
        {
          if (((Iterator)localObject).hasNext()) {
            if (((sp)((Iterator)localObject).next()).tPF != 0)
            {
              this.oUB = false;
              break;
            }
          }
        }
        this.oUB = true;
      }
    }
  }
  
  protected final h aZn()
  {
    GMTrace.i(7552163119104L, 56268);
    d locald = new d(this, new c(this));
    GMTrace.o(7552163119104L, 56268);
    return locald;
  }
  
  protected final String aZo()
  {
    GMTrace.i(7552565772288L, 56271);
    Object localObject;
    if ((14 == this.oUA.field_type) && (!bg.mZ(this.oUA.field_favProto.title))) {
      localObject = this.oUA.field_favProto.title;
    }
    for (;;)
    {
      GMTrace.o(7552565772288L, 56271);
      return (String)localObject;
      ta localta = this.oUA.field_favProto.tQA;
      if ((localta != null) && (!bg.mZ(localta.tQf)))
      {
        String str1 = n.fc(localta.tQf);
        String str2;
        if (com.tencent.mm.x.m.zF().equals(localta.fFB))
        {
          str2 = com.tencent.mm.plugin.record.a.m.fd(localta.toUser);
          localObject = str1;
          if (!bg.ap(str2, "").equals(localta.toUser)) {
            localObject = str1 + " - " + str2;
          }
        }
        for (;;)
        {
          w.v("MicroMsg.FavRecordDetailUI", "display name, source from[%s] to[%s]", new Object[] { localta.fFB, localta.toUser });
          break;
          str2 = com.tencent.mm.plugin.record.a.m.fd(localta.fFB);
          localObject = str1;
          if (!bg.ap(str2, "").equals(localta.fFB)) {
            localObject = str1 + " - " + str2;
          }
        }
      }
      w.v("MicroMsg.FavRecordDetailUI", "display name, from item info user[%s]", new Object[] { this.oUA.field_fromUser });
      localObject = com.tencent.mm.plugin.record.a.m.fd(this.oUA.field_fromUser);
    }
  }
  
  protected final String aZp()
  {
    GMTrace.i(7552699990016L, 56272);
    Object localObject = this.oUA.field_favProto.tQC;
    if (((LinkedList)localObject).size() > 0)
    {
      localObject = ((sp)((LinkedList)localObject).getFirst()).tPv;
      GMTrace.o(7552699990016L, 56272);
      return (String)localObject;
    }
    GMTrace.o(7552699990016L, 56272);
    return null;
  }
  
  protected final String aZq()
  {
    GMTrace.i(7552834207744L, 56273);
    Object localObject = this.oUA.field_favProto.tQC;
    if (((LinkedList)localObject).size() > 0)
    {
      localObject = ((sp)((LinkedList)localObject).getLast()).tPv;
      GMTrace.o(7552834207744L, 56273);
      return (String)localObject;
    }
    GMTrace.o(7552834207744L, 56273);
    return null;
  }
  
  protected final void aZr()
  {
    GMTrace.i(7552968425472L, 56274);
    if (!this.fHE)
    {
      GMTrace.o(7552968425472L, 56274);
      return;
    }
    a(0, R.l.eMR, R.g.baG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7556592304128L, 56301);
        paramAnonymousMenuItem = new e(FavRecordDetailUI.this.vov.voR, e.wSP, false);
        paramAnonymousMenuItem.qQS = new o.c()
        {
          public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
          {
            GMTrace.i(7534983249920L, 56140);
            w.i("MicroMsg.FavRecordDetailUI", "favItemInfo: id %d, status %d", new Object[] { Integer.valueOf(FavRecordDetailUI.b(FavRecordDetailUI.this).field_id), Integer.valueOf(FavRecordDetailUI.b(FavRecordDetailUI.this).field_itemStatus) });
            if ((FavRecordDetailUI.b(FavRecordDetailUI.this).field_id > 0) && (!FavRecordDetailUI.b(FavRecordDetailUI.this).awL()) && (!FavRecordDetailUI.b(FavRecordDetailUI.this).awM()) && (FavRecordDetailUI.c(FavRecordDetailUI.this))) {
              paramAnonymous2m.e(0, FavRecordDetailUI.this.getString(R.l.dXS));
            }
            paramAnonymous2m.e(3, FavRecordDetailUI.this.getString(R.l.dWs));
            paramAnonymous2m.e(2, FavRecordDetailUI.this.getString(R.l.duY));
            GMTrace.o(7534983249920L, 56140);
          }
        };
        paramAnonymousMenuItem.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(7535654338560L, 56145);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(7535654338560L, 56145);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("scene_from", 1);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("select_fav_local_id", FavRecordDetailUI.b(FavRecordDetailUI.this).field_localId);
              com.tencent.mm.bi.d.a(FavRecordDetailUI.this, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 4097);
              g.paX.i(10651, new Object[] { Integer.valueOf(14), Integer.valueOf(1), Integer.valueOf(0) });
              GMTrace.o(7535654338560L, 56145);
              return;
              com.tencent.mm.ui.base.h.a(FavRecordDetailUI.this.vov.voR, FavRecordDetailUI.this.getString(R.l.duZ), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(7543975837696L, 56207);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavRecordDetailUI.this.vov.voR, FavRecordDetailUI.this.getString(R.l.duZ), false, null);
                  fr localfr = new fr();
                  localfr.fBn.type = 12;
                  localfr.fBn.fwq = FavRecordDetailUI.a(FavRecordDetailUI.this);
                  localfr.fBn.fBs = new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(7551357812736L, 56262);
                      paramAnonymous3DialogInterface.dismiss();
                      w.d("MicroMsg.FavRecordDetailUI", "do del, local id %d", new Object[] { Long.valueOf(FavRecordDetailUI.a(FavRecordDetailUI.this)) });
                      FavRecordDetailUI.this.finish();
                      GMTrace.o(7551357812736L, 56262);
                    }
                  };
                  com.tencent.mm.sdk.b.a.uLm.m(localfr);
                  GMTrace.o(7543975837696L, 56207);
                }
              }, null);
              GMTrace.o(7535654338560L, 56145);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavRecordDetailUI.a(FavRecordDetailUI.this));
              com.tencent.mm.bi.d.b(FavRecordDetailUI.this.vov.voR, "favorite", ".ui.FavTagEditUI", paramAnonymous2MenuItem);
              GMTrace.o(7535654338560L, 56145);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 1);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavRecordDetailUI.b(FavRecordDetailUI.this).field_localId);
              com.tencent.mm.bi.d.b(FavRecordDetailUI.this.vov.voR, "favorite", ".ui.FavTagEditUI", paramAnonymous2MenuItem);
            }
          }
        };
        paramAnonymousMenuItem.bCV();
        GMTrace.o(7556592304128L, 56301);
        return true;
      }
    });
    GMTrace.o(7552968425472L, 56274);
  }
  
  protected final void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(7553102643200L, 56275);
    if ((4097 == paramInt1) && (-1 == paramInt2))
    {
      Object localObject = new fr();
      ((fr)localObject).fBn.type = 32;
      ((fr)localObject).fBn.fwq = this.lWj;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
      if (((fr)localObject).fBo.fBD)
      {
        com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.drQ));
        GMTrace.o(7553102643200L, 56275);
        return;
      }
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label248;
        }
      }
      label248:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        final q localq = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dWT), false, null);
        fr localfr = new fr();
        localfr.fBn.type = 13;
        localfr.fBn.context = this.vov.voR;
        localfr.fBn.toUser = ((String)localObject);
        localfr.fBn.fBt = paramIntent;
        localfr.fBn.fwq = this.lWj;
        localfr.fBn.fBs = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7531225153536L, 56112);
            localq.dismiss();
            com.tencent.mm.ui.snackbar.a.e(FavRecordDetailUI.this, FavRecordDetailUI.this.getString(R.l.dZv));
            GMTrace.o(7531225153536L, 56112);
          }
        };
        com.tencent.mm.sdk.b.a.uLm.m(localfr);
        GMTrace.o(7553102643200L, 56275);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
    }
    GMTrace.o(7553102643200L, 56275);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7551894683648L, 56266);
    super.onCreate(paramBundle);
    GMTrace.o(7551894683648L, 56266);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16877745078272L, 125749);
    if (this.oUC != null) {
      com.tencent.mm.sdk.b.a.uLm.c(this.oUC);
    }
    if ((this.oUP != null) && (((d)this.oUP).oUw != null)) {
      com.tencent.mm.sdk.b.a.uLm.c(((d)this.oUP).oUw);
    }
    super.onDestroy();
    GMTrace.o(16877745078272L, 125749);
  }
  
  protected void onResume()
  {
    GMTrace.i(7552297336832L, 56269);
    super.onResume();
    Object localObject2 = (b)((d)this.oUP).oUL;
    com.tencent.mm.plugin.record.a.c localc;
    Object localObject1;
    if (((b)localObject2).oUu != null)
    {
      localc = com.tencent.mm.plugin.record.a.d.cZ(((b)localObject2).oUu.field_localId);
      if ((localc == null) || (localc.field_favProto == null))
      {
        GMTrace.o(7552297336832L, 56269);
        return;
      }
      localObject1 = localc.field_favProto.tQC;
      localObject2 = ((b)localObject2).oUt.iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext()) {
          break;
        }
      } while (((LinkedList)localObject1).contains((sp)((Iterator)localObject2).next()));
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject1 = new b();
        ((b)localObject1).oUu = localc;
        ((b)localObject1).oUt = localc.field_favProto.tQC;
        this.oUP.a((a)localObject1);
      }
      GMTrace.o(7552297336832L, 56269);
      return;
    }
  }
  
  protected void onStop()
  {
    GMTrace.i(7552431554560L, 56270);
    super.onStop();
    GMTrace.o(7552431554560L, 56270);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/FavRecordDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */