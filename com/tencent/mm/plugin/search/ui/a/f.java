package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.search.ui.FTSTalkerUI;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.ay;
import com.tencent.mm.x.n;
import com.tencent.mm.x.o;
import java.util.ArrayList;
import java.util.List;

public class f
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public com.tencent.mm.plugin.fts.a.a.i iOg;
  public List<String> iOh;
  public CharSequence iiG;
  public CharSequence iiH;
  public int poe;
  private b pof;
  a pog;
  public String username;
  
  public f(int paramInt)
  {
    super(6, paramInt);
    GMTrace.i(11849948987392L, 88289);
    this.pof = new b();
    this.pog = new a();
    GMTrace.o(11849948987392L, 88289);
  }
  
  public com.tencent.mm.plugin.fts.d.a.a.b Vk()
  {
    GMTrace.i(16471602233344L, 122723);
    b localb = this.pof;
    GMTrace.o(16471602233344L, 122723);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18366219681792L, 136839);
    a locala = this.pog;
    GMTrace.o(18366219681792L, 136839);
    return locala;
  }
  
  public final int Vn()
  {
    GMTrace.i(11850351640576L, 88292);
    int i = this.iOg.mkP;
    GMTrace.o(11850351640576L, 88292);
    return i;
  }
  
  public void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16471468015616L, 122722);
    parama = (a)parama;
    this.username = this.iOg.mkj;
    this.iiG = h.b(paramContext, n.fc(this.username), parama.kfQ.getTextSize());
    if ((this.iOg.userData instanceof Integer)) {
      this.poe = ((Integer)this.iOg.userData).intValue();
    }
    if (this.poe < 2)
    {
      String str = "";
      parama = "";
      ap.AS();
      paramVarArgs = com.tencent.mm.x.c.yN().cI(this.iOg.mkG);
      switch (this.iOg.hJy)
      {
      default: 
        paramVarArgs = str;
      }
      for (;;)
      {
        this.iiH = h.c(paramContext, parama.replace('\n', ' '), d.b.mmX);
        if (bg.L(paramVarArgs)) {
          break;
        }
        float f1 = com.tencent.mm.plugin.fts.d.f.a.mnc;
        float f2 = d.b.mmY.measureText(paramVarArgs.toString());
        this.iiH = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.iiH, this.fIW, this.iOh, f1 - f2, d.b.mmY)).mok;
        this.iiH = TextUtils.concat(new CharSequence[] { paramVarArgs, this.iiH });
        GMTrace.o(16471468015616L, 122722);
        return;
        parama = paramVarArgs.field_content;
        Object localObject = parama;
        if (parama == null) {
          if (this.iOg.content != null) {
            break label327;
          }
        }
        label327:
        for (localObject = "";; localObject = this.iOg.content)
        {
          parama = (a.a)localObject;
          paramVarArgs = str;
          if (!o.dW(this.username)) {
            break;
          }
          parama = ay.gA((String)localObject);
          paramVarArgs = str;
          break;
        }
        paramVarArgs = com.tencent.mm.w.f.a.eC(paramVarArgs.field_content);
        if (paramVarArgs != null) {
          parama = paramVarArgs.title;
        }
        paramVarArgs = paramContext.getString(R.l.ebN);
        continue;
        paramVarArgs = com.tencent.mm.w.f.a.eC(paramVarArgs.field_content);
        if (paramVarArgs != null) {
          parama = paramVarArgs.title;
        }
        paramVarArgs = paramContext.getString(R.l.ebO);
        continue;
        localObject = com.tencent.mm.w.f.a.eC(paramVarArgs.field_content);
        paramVarArgs = str;
        if (localObject != null)
        {
          paramVarArgs = ((com.tencent.mm.w.f.a)localObject).title + ": ";
          parama = ((com.tencent.mm.w.f.a)localObject).description;
          continue;
          localObject = com.tencent.mm.w.f.a.eC(paramVarArgs.field_content);
          paramVarArgs = str;
          if (localObject != null)
          {
            parama = bg.ap(((com.tencent.mm.w.f.a)localObject).title, "") + ": " + bg.ap(((com.tencent.mm.w.f.a)localObject).description, "");
            paramVarArgs = str;
            continue;
            parama = com.tencent.mm.w.f.a.eC(paramVarArgs.field_content);
            if (paramVarArgs.field_isSend == 1)
            {
              parama = bg.ap(parama.hcs, "") + ": " + bg.ap(parama.hcp, "");
              paramVarArgs = str;
            }
            else
            {
              parama = bg.ap(parama.hcs, "") + ": " + bg.ap(parama.hco, "");
              paramVarArgs = str;
            }
          }
        }
      }
      this.iiH = com.tencent.mm.plugin.fts.d.f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.iiH, this.fIW, this.iOh, com.tencent.mm.plugin.fts.d.f.a.mnc, d.b.mmY)).mok;
      GMTrace.o(16471468015616L, 122722);
      return;
    }
    this.iiH = paramContext.getResources().getString(R.l.eEL, new Object[] { Integer.valueOf(this.poe) });
    GMTrace.o(16471468015616L, 122722);
  }
  
  public final class a
    extends a.a
  {
    public View iiK;
    public ImageView iiL;
    public TextView kGV;
    public TextView kfQ;
    
    public a()
    {
      super();
      GMTrace.i(11853035995136L, 88312);
      GMTrace.o(11853035995136L, 88312);
    }
  }
  
  public class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11847935721472L, 88274);
      GMTrace.o(11847935721472L, 88274);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11848069939200L, 88275);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVH, paramViewGroup, false);
      paramViewGroup = (f.a)f.this.pog;
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(R.h.bjt));
      paramViewGroup.kfQ = ((TextView)paramContext.findViewById(R.h.cgr));
      paramViewGroup.kGV = ((TextView)paramContext.findViewById(R.h.cdQ));
      paramViewGroup.iiK = paramContext.findViewById(R.h.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11848069939200L, 88275);
      return paramContext;
    }
    
    public void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16472944410624L, 122733);
      paramContext = (f)paramVarArgs;
      parama = (f.a)parama;
      cj(parama.iiK);
      com.tencent.mm.pluginsdk.ui.a.b.a(parama.iiL, paramContext.username);
      e.a(paramContext.iiG, parama.kfQ);
      e.a(paramContext.iiH, parama.kGV);
      GMTrace.o(16472944410624L, 122733);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      Object localObject2 = null;
      Object localObject1 = null;
      GMTrace.i(16473078628352L, 122734);
      f localf = (f)paramVarArgs;
      if (f.this.poe < 2) {
        if (com.tencent.mm.ae.f.iA(localf.username))
        {
          paramVarArgs = new Intent().putExtra("Contact_User", localf.username);
          com.tencent.mm.plugin.search.a.ifM.d(paramVarArgs, paramContext);
        }
      }
      for (;;)
      {
        GMTrace.o(16473078628352L, 122734);
        return true;
        if (com.tencent.mm.ae.f.dG(localf.username))
        {
          paramVarArgs = new Intent();
          paramVarArgs.putExtra("Contact_User", localf.username);
          paramVarArgs.addFlags(67108864);
          paramVarArgs.putExtra("biz_chat_from_scene", 5);
          com.tencent.mm.bi.d.a(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
        }
        else
        {
          if (com.tencent.mm.ae.f.iB(localf.username))
          {
            paramVarArgs = com.tencent.mm.ae.f.iv(localf.username);
            if (paramVarArgs == null) {}
            for (paramVarArgs = (com.tencent.mm.plugin.fts.d.a.a)localObject1;; paramVarArgs = paramVarArgs.EI())
            {
              localObject1 = paramVarArgs;
              if (paramVarArgs == null) {
                localObject1 = "";
              }
              paramVarArgs = new Intent();
              paramVarArgs.putExtra("rawUrl", (String)localObject1);
              paramVarArgs.putExtra("useJs", true);
              paramVarArgs.putExtra("srcUsername", localf.username);
              paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
              paramVarArgs.addFlags(67108864);
              com.tencent.mm.bi.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
              break;
            }
          }
          paramVarArgs = new ArrayList(localf.iOh);
          paramVarArgs = new Intent().putExtra("Chat_User", localf.username).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", localf.iOg.mkG).putExtra("highlight_keyword_list", paramVarArgs);
          com.tencent.mm.plugin.search.a.ifM.e(paramVarArgs, paramContext);
          continue;
          if (com.tencent.mm.ae.f.dG(localf.username))
          {
            paramVarArgs = new Intent();
            paramVarArgs.putExtra("Contact_User", localf.username);
            paramVarArgs.addFlags(67108864);
            paramVarArgs.putExtra("biz_chat_from_scene", 5);
            com.tencent.mm.bi.d.a(paramContext, ".ui.bizchat.BizChatConversationUI", paramVarArgs);
          }
          else
          {
            if (com.tencent.mm.ae.f.iB(localf.username))
            {
              paramVarArgs = com.tencent.mm.ae.f.iv(localf.username);
              if (paramVarArgs == null) {}
              for (paramVarArgs = (com.tencent.mm.plugin.fts.d.a.a)localObject2;; paramVarArgs = paramVarArgs.EI())
              {
                localObject1 = paramVarArgs;
                if (paramVarArgs == null) {
                  localObject1 = "";
                }
                paramVarArgs = new Intent();
                paramVarArgs.putExtra("rawUrl", (String)localObject1);
                paramVarArgs.putExtra("useJs", true);
                paramVarArgs.putExtra("srcUsername", localf.username);
                paramVarArgs.putExtra("bizofstartfrom", "enterpriseHomeSubBrand");
                paramVarArgs.addFlags(67108864);
                com.tencent.mm.bi.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramVarArgs);
                break;
              }
            }
            paramContext.startActivity(new Intent(paramContext, FTSTalkerUI.class).putExtra("Search_Scene", f.this.mmQ).putExtra("key_talker", localf.username).putExtra("key_query", localf.fIW).putExtra("key_count", localf.poe));
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */