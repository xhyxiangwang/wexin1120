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
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.model.av;
import com.tencent.mm.plugin.sns.model.aw;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.x.o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.a.d.i;

public final class be
  implements z
{
  private String appName;
  private String fKY;
  private MMActivity fsU;
  private boolean qBW;
  private boolean qBX;
  private WXMediaMessage qBY;
  private String qCX;
  private b qyD;
  private int qyx;
  
  public be(MMActivity paramMMActivity)
  {
    GMTrace.i(8719052046336L, 64962);
    this.fKY = "";
    this.appName = "";
    this.qBW = false;
    this.qBX = false;
    this.qBY = null;
    this.qCX = "";
    this.qyD = null;
    this.fsU = paramMMActivity;
    GMTrace.o(8719052046336L, 64962);
  }
  
  public final void D(Bundle paramBundle)
  {
    GMTrace.i(8719186264064L, 64963);
    this.qyD = b.q(this.fsU.getIntent());
    this.qCX = this.fsU.getIntent().getStringExtra("Kdescription");
    this.fKY = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appid"), "");
    this.appName = bg.ap(this.fsU.getIntent().getStringExtra("Ksnsupload_appname"), "");
    this.qBW = this.fsU.getIntent().getBooleanExtra("KThrid_app", false);
    this.qBX = this.fsU.getIntent().getBooleanExtra("KSnsAction", false);
    this.qyx = this.fsU.getIntent().getIntExtra("Ksnsupload_source", 0);
    this.qBY = new SendMessageToWX.Req(this.fsU.getIntent().getBundleExtra("Ksnsupload_timeline")).message;
    GMTrace.o(8719186264064L, 64963);
  }
  
  public final void E(Bundle paramBundle)
  {
    GMTrace.i(8719320481792L, 64964);
    GMTrace.o(8719320481792L, 64964);
  }
  
  public final boolean a(int paramInt1, int paramInt2, i parami, String paramString1, List<String> paramList1, akv paramakv, int paramInt3, boolean paramBoolean, List<String> paramList2, PInt paramPInt, String paramString2, int paramInt4, int paramInt5)
  {
    GMTrace.i(8719723134976L, 64967);
    ae.bhl();
    paramString1 = av.a(this.qBY, paramString1, this.fKY, this.appName);
    if (paramString1 == null)
    {
      w.e("MicroMsg.TextWidget", "packHelper == null, %s, %s", new Object[] { this.fKY, this.appName });
      GMTrace.o(8719723134976L, 64967);
      return false;
    }
    paramPInt.value = paramString1.jOR;
    if (paramInt3 > a.pXZ) {
      paramString1.uk(4);
    }
    paramString1.uo(this.qyx);
    if (this.qBW) {
      paramString1.uo(5);
    }
    paramPInt = new LinkedList();
    if (paramList1 != null)
    {
      new LinkedList();
      paramString2 = o.Au();
      paramList1 = paramList1.iterator();
      while (paramList1.hasNext())
      {
        String str = (String)paramList1.next();
        if (!paramString2.contains(str))
        {
          bes localbes = new bes();
          localbes.jWW = str;
          paramPInt.add(localbes);
        }
      }
    }
    paramString1.ak(paramPInt);
    if (parami != null) {
      paramString1.dw(parami.token, parami.uih);
    }
    paramString1.a(paramakv);
    if (paramBoolean) {
      paramString1.up(1);
    }
    for (;;)
    {
      paramString1.bq(paramList2);
      paramString1.d(null, null, null, paramInt4, paramInt5);
      if ((this.qBX) && (this.qBY != null))
      {
        paramString1.GS(this.qBY.mediaTagName);
        paramString1.S(this.fKY, this.qBY.messageExt, this.qBY.messageAction);
      }
      paramInt1 = paramString1.commit();
      if (this.qyD != null)
      {
        this.qyD.gO(paramInt1);
        e.qkT.b(this.qyD);
      }
      ae.bhl().bgd();
      this.fsU.finish();
      GMTrace.o(8719723134976L, 64967);
      return false;
      paramString1.up(0);
    }
  }
  
  public final boolean a(int paramInt, Intent paramIntent)
  {
    GMTrace.i(8719857352704L, 64968);
    GMTrace.o(8719857352704L, 64968);
    return false;
  }
  
  public final boolean blb()
  {
    GMTrace.i(8719454699520L, 64965);
    GMTrace.o(8719454699520L, 64965);
    return true;
  }
  
  public final View blc()
  {
    GMTrace.i(8719588917248L, 64966);
    GMTrace.o(8719588917248L, 64966);
    return null;
  }
  
  public final boolean bld()
  {
    GMTrace.i(8719991570432L, 64969);
    GMTrace.o(8719991570432L, 64969);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */