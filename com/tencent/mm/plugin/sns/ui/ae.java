package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsns.b;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.h.e;
import com.tencent.mm.plugin.sns.h.g;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.a.d.i;

public final class ae
  implements z
{
  private String appName;
  private String fKY;
  private MMActivity fsU;
  private boolean qBW;
  private boolean qBX;
  private WXMediaMessage qBY;
  private String qCX;
  private boolean qCY;
  private b qyD;
  private int qyx;
  
  public ae(MMActivity paramMMActivity, boolean paramBoolean)
  {
    GMTrace.i(8639595151360L, 64370);
    this.fKY = "";
    this.appName = "";
    this.qBW = false;
    this.qBX = false;
    this.qBY = null;
    this.qCX = "";
    this.qCY = false;
    this.qyD = null;
    this.fsU = paramMMActivity;
    this.qCY = paramBoolean;
    GMTrace.o(8639595151360L, 64370);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8639729369088L, 64371);
    this.qyD = b.q(this.fsU.getIntent());
    this.qCX = this.fsU.getIntent().getStringExtra("Kdescription");
    this.fKY = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.qBW = this.fsU.getIntent().getBooleanExtra("KThrid_app", false);
    this.qBX = this.fsU.getIntent().getBooleanExtra("KSnsAction", false);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    paramBundle = this.fsU.getIntent().getBundleExtra("Ksnsupload_timeline");
    if (paramBundle != null) {
      this.qBY = new SendMessageToWX.Req(paramBundle).message;
    }
    GMTrace.o(8639729369088L, 64371);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8639863586816L, 64372);
    GMTrace.o(8639863586816L, 64372);
  }
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8640266240000L, 64375);
    if (this.fsU.isFinishing())
    {
      GMTrace.o(8640266240000L, 64375);
      return false;
    }
    paramString2 = new aw(2);
    paramPInt.value = paramString2.jOR;
    if (paramInt3 > a.pXZ) {
      paramString2.uk(2);
    }
    paramPInt = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      List localList = o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!localList.contains(str))
        {
          bes localbes = new bes();
          localbes.jWW = str;
          paramPInt.add(localbes);
        }
      }
    }
    if (paramBoolean) {
      paramString2.up(1);
    }
    for (;;)
    {
      if (parami != null) {
        paramString2.dw(parami.token, parami.uih);
      }
      paramString2.uo(this.qyx);
      if (this.qBW) {
        paramString2.uo(5);
      }
      if ((this.qBX) && (this.qBY != null))
      {
        paramString2.GS(this.qBY.mediaTagName);
        paramString2.S(this.fKY, this.qBY.messageExt, this.qBY.messageAction);
      }
      paramString2.d(null, null, null, paramInt4, paramInt5);
      paramString2.GR(paramString1).a(paramakv).ak(paramPInt).um(paramInt1).un(paramInt2).bq(paramList2);
      paramInt1 = paramString2.commit();
      if (this.qyD != null)
      {
        this.qyD.gO(paramInt1);
        e.qkT.b(this.qyD);
      }
      this.fsU.setResult(-1);
      com.tencent.mm.plugin.sns.model.ae.bhl().bgd();
      this.fsU.finish();
      GMTrace.o(8640266240000L, 64375);
      return true;
      paramString2.up(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8640400457728L, 64376);
    GMTrace.o(8640400457728L, 64376);
    return false;
  }
  
  public final boolean blb()
  {
    GMTrace.i(8639997804544L, 64373);
    boolean bool = this.qCY;
    GMTrace.o(8639997804544L, 64373);
    return bool;
  }
  
  public final View blc()
  {
    GMTrace.i(8640132022272L, 64374);
    GMTrace.o(8640132022272L, 64374);
    return null;
  }
  
  public final boolean bld()
  {
    GMTrace.i(8640534675456L, 64377);
    GMTrace.o(8640534675456L, 64377);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */