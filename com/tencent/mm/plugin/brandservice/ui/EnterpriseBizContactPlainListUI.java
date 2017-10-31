package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ae.d;
import com.tencent.mm.ae.f;
import com.tencent.mm.bt.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b.a;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public class EnterpriseBizContactPlainListUI
  extends MMActivity
{
  private String hnU;
  private a kkN;
  private long kkO;
  private AdapterView.OnItemClickListener kkP;
  private ListView kky;
  private int scene;
  
  public EnterpriseBizContactPlainListUI()
  {
    GMTrace.i(10885863047168L, 81106);
    GMTrace.o(10885863047168L, 81106);
  }
  
  protected final void MH()
  {
    GMTrace.i(10886131482624L, 81108);
    this.kky = ((ListView)findViewById(R.h.bEJ));
    if (this.kkN == null)
    {
      this.kkN = new a(this);
      this.kkP = new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(10871635968000L, 81000);
          w.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "onItemClick position = %s", new Object[] { Integer.valueOf(paramAnonymousInt) });
          EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this, paramAnonymousInt);
          GMTrace.o(10871635968000L, 81000);
        }
      };
    }
    w.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "count = %s", new Object[] { Integer.valueOf(this.kkN.getCount()) });
    ap.AS();
    Object localObject = c.yL().SL(this.hnU);
    if (this.scene == 2)
    {
      oC(R.l.dTi);
      if ((localObject != null) && (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type)) && (this.kkN.getCount() > 0)) {
        break label214;
      }
      this.kky.setVisibility(8);
      localObject = (TextView)findViewById(R.h.bEK);
      ((TextView)localObject).setText(R.l.dTo);
      ((TextView)localObject).setVisibility(0);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(10866938347520L, 80965);
          EnterpriseBizContactPlainListUI.this.aKl();
          EnterpriseBizContactPlainListUI.this.finish();
          GMTrace.o(10866938347520L, 80965);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(10854187663360L, 80870);
          BackwardSupportUtil.c.a(EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this));
          GMTrace.o(10854187663360L, 80870);
        }
      };
      GMTrace.o(10886131482624L, 81108);
      return;
      if (localObject == null) {
        break;
      }
      rV(((com.tencent.mm.storage.x)localObject).vp());
      break;
      label214:
      this.kky.setVisibility(0);
      this.kky.setAdapter(this.kkN);
      this.kky.setOnItemClickListener(this.kkP);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10886668353536L, 81112);
    int i = R.i.cSQ;
    GMTrace.o(10886668353536L, 81112);
    return i;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10886802571264L, 81113);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.scene == 4) {
      finish();
    }
    GMTrace.o(10886802571264L, 81113);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10885997264896L, 81107);
    super.onCreate(paramBundle);
    this.scene = getIntent().getIntExtra("enterprise_scene", 2);
    this.hnU = getIntent().getStringExtra("enterprise_biz_name");
    this.kkO = getIntent().getLongExtra("biz_chat_chat_id", -1L);
    w.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "bizName = %s", new Object[] { this.hnU });
    MH();
    com.tencent.mm.ae.x.FE().c(this.kkN);
    ap.AS();
    c.yL().a(this.kkN);
    GMTrace.o(10885997264896L, 81107);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(10886534135808L, 81111);
    com.tencent.mm.ae.x.FE().j(this.kkN);
    ap.AS();
    c.yL().b(this.kkN);
    this.kkN.aIb();
    a locala = this.kkN;
    if (locala.hvk != null)
    {
      locala.hvk.detach();
      locala.hvk = null;
    }
    super.onDestroy();
    GMTrace.o(10886534135808L, 81111);
  }
  
  protected void onPause()
  {
    GMTrace.i(10886399918080L, 81110);
    super.onPause();
    GMTrace.o(10886399918080L, 81110);
  }
  
  protected void onResume()
  {
    GMTrace.i(10886265700352L, 81109);
    super.onResume();
    if (!com.tencent.mm.x.o.fm(this.hnU))
    {
      w.e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "%s !isContact", new Object[] { this.hnU });
      finish();
      GMTrace.o(10886265700352L, 81109);
      return;
    }
    GMTrace.o(10886265700352L, 81109);
  }
  
  final class a
    extends com.tencent.mm.ui.o<com.tencent.mm.plugin.brandservice.a.b>
    implements m.b
  {
    com.tencent.mm.ui.applet.b hvk;
    private b.b hvl;
    
    public a(Context paramContext)
    {
      super(new com.tencent.mm.plugin.brandservice.a.b());
      GMTrace.i(10865327734784L, 80953);
      this.hvl = null;
      this.hvk = new com.tencent.mm.ui.applet.b(new b.a()
      {
        public final Bitmap jD(String paramAnonymousString)
        {
          GMTrace.i(10877541548032L, 81044);
          paramAnonymousString = com.tencent.mm.ab.b.a(paramAnonymousString, false, -1);
          GMTrace.o(10877541548032L, 81044);
          return paramAnonymousString;
        }
      });
      QA();
      GMTrace.o(10865327734784L, 80953);
    }
    
    public final void QA()
    {
      StringBuilder localStringBuilder = null;
      GMTrace.i(10865864605696L, 80957);
      if (!ap.AV())
      {
        w.e("MicroMsg.EnterpriseBizListAdapter", "accHasReady");
        GMTrace.o(10865864605696L, 80957);
        return;
      }
      aIb();
      Object localObject;
      switch (EnterpriseBizContactPlainListUI.b(EnterpriseBizContactPlainListUI.this))
      {
      default: 
        com.tencent.mm.ae.x.FE();
        localObject = com.tencent.mm.ae.e.t(EnterpriseBizContactPlainListUI.c(EnterpriseBizContactPlainListUI.this), true);
      }
      for (;;)
      {
        setCursor((Cursor)localObject);
        GMTrace.o(10865864605696L, 80957);
        return;
        com.tencent.mm.ae.x.FE();
        localObject = com.tencent.mm.ae.e.x(EnterpriseBizContactPlainListUI.c(EnterpriseBizContactPlainListUI.this), 25);
        continue;
        com.tencent.mm.ae.x.FE();
        localObject = EnterpriseBizContactPlainListUI.c(EnterpriseBizContactPlainListUI.this);
        localStringBuilder = new StringBuilder();
        com.tencent.mm.ae.e.b(localStringBuilder);
        com.tencent.mm.ae.e.c(localStringBuilder);
        com.tencent.mm.ae.e.a(localStringBuilder, (String)localObject);
        com.tencent.mm.ae.e.b(localStringBuilder, false);
        com.tencent.mm.ae.e.a(localStringBuilder, false);
        localStringBuilder.append(" order by ");
        localStringBuilder.append(com.tencent.mm.ae.e.Fi());
        localObject = localStringBuilder.toString();
        w.i("MicroMsg.BizInfoStorage", "getEnterpriseDisableChild sql %s", new Object[] { localObject });
        localObject = com.tencent.mm.kernel.h.xz().gRs.a((String)localObject, null, 0);
        continue;
        com.tencent.mm.ae.x.FE();
        localObject = com.tencent.mm.ae.e.x(EnterpriseBizContactPlainListUI.c(EnterpriseBizContactPlainListUI.this), 128);
        continue;
        d locald = f.iv(EnterpriseBizContactPlainListUI.c(EnterpriseBizContactPlainListUI.this));
        localObject = localStringBuilder;
        if (locald != null)
        {
          localObject = localStringBuilder;
          if (locald.field_enterpriseFather != null) {
            localObject = com.tencent.mm.ae.x.FE().ip(locald.field_enterpriseFather);
          }
        }
      }
    }
    
    protected final void QB()
    {
      GMTrace.i(15571135496192L, 116014);
      QA();
      GMTrace.o(15571135496192L, 116014);
    }
    
    public final void a(String paramString, l paraml)
    {
      GMTrace.i(10865461952512L, 80954);
      w.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange");
      com.tencent.mm.sdk.platformtools.af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10850698002432L, 80844);
          EnterpriseBizContactPlainListUI.a.this.QB();
          TextView localTextView = (TextView)EnterpriseBizContactPlainListUI.this.findViewById(R.h.bEK);
          if ((EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this) != null) && (localTextView != null))
          {
            ap.AS();
            com.tencent.mm.storage.x localx = c.yL().SL(EnterpriseBizContactPlainListUI.c(EnterpriseBizContactPlainListUI.this));
            if ((localx != null) && (com.tencent.mm.l.a.eE(localx.field_type))) {
              break label122;
            }
            EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this).setVisibility(8);
            localTextView.setVisibility(0);
          }
          for (;;)
          {
            EnterpriseBizContactPlainListUI.a.this.notifyDataSetChanged();
            GMTrace.o(10850698002432L, 80844);
            return;
            label122:
            if (EnterpriseBizContactPlainListUI.d(EnterpriseBizContactPlainListUI.this).getCount() <= 0)
            {
              EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this).setVisibility(8);
              localTextView.setVisibility(0);
            }
            else
            {
              EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this).setVisibility(0);
              localTextView.setVisibility(8);
              EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this).setAdapter(EnterpriseBizContactPlainListUI.d(EnterpriseBizContactPlainListUI.this));
              EnterpriseBizContactPlainListUI.a(EnterpriseBizContactPlainListUI.this).setOnItemClickListener(EnterpriseBizContactPlainListUI.e(EnterpriseBizContactPlainListUI.this));
            }
          }
        }
      });
      GMTrace.o(10865461952512L, 80954);
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(10865596170240L, 80955);
      if (this.hvl == null) {
        this.hvl = new b.b()
        {
          public final int Hh()
          {
            GMTrace.i(10872307056640L, 81005);
            int i = EnterpriseBizContactPlainListUI.a.this.getCount();
            GMTrace.o(10872307056640L, 81005);
            return i;
          }
          
          public final String fQ(int paramAnonymousInt)
          {
            GMTrace.i(10872172838912L, 81004);
            if ((paramAnonymousInt < 0) || (paramAnonymousInt >= EnterpriseBizContactPlainListUI.a.this.getCount()))
            {
              w.e("MicroMsg.EnterpriseBizListAdapter", "pos is invalid");
              GMTrace.o(10872172838912L, 81004);
              return null;
            }
            Object localObject = (com.tencent.mm.plugin.brandservice.a.b)EnterpriseBizContactPlainListUI.a.this.getItem(paramAnonymousInt);
            if (localObject == null)
            {
              GMTrace.o(10872172838912L, 81004);
              return null;
            }
            localObject = ((com.tencent.mm.plugin.brandservice.a.b)localObject).userName;
            GMTrace.o(10872172838912L, 81004);
            return (String)localObject;
          }
        };
      }
      if (this.hvk != null) {
        this.hvk.a(paramInt, this.hvl);
      }
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, R.i.cSO, null);
        paramViewGroup.hvo = ((ImageView)paramView.findViewById(R.h.ceT));
        paramViewGroup.hvp = ((TextView)paramView.findViewById(R.h.ceZ));
        paramView.setTag(paramViewGroup);
      }
      com.tencent.mm.plugin.brandservice.a.b localb;
      for (;;)
      {
        localb = (com.tencent.mm.plugin.brandservice.a.b)getItem(paramInt);
        if (localb != null) {
          break;
        }
        paramViewGroup.clear();
        GMTrace.o(10865596170240L, 80955);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
      }
      paramViewGroup.clear();
      paramInt = paramView.getPaddingBottom();
      int i = paramView.getPaddingTop();
      int j = paramView.getPaddingRight();
      int k = paramView.getPaddingLeft();
      paramView.setBackgroundDrawable(com.tencent.mm.bq.a.b(this.context, R.g.aYc));
      paramView.setPadding(k, i, j, paramInt);
      String str = bg.mY(localb.jqN.vp());
      paramViewGroup.hvp.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, str, paramViewGroup.hvp.getTextSize()));
      paramViewGroup.hvp.setVisibility(0);
      paramViewGroup.hvo.setVisibility(0);
      if (!bg.mZ(localb.jqN.field_username)) {
        a.b.a(paramViewGroup.hvo, localb.jqN.field_username);
      }
      for (;;)
      {
        GMTrace.o(10865596170240L, 80955);
        return paramView;
        paramViewGroup.hvo.setImageDrawable(null);
      }
    }
    
    final class a
    {
      ImageView hvo;
      TextView hvp;
      
      a()
      {
        GMTrace.i(10889755361280L, 81135);
        GMTrace.o(10889755361280L, 81135);
      }
      
      public final void clear()
      {
        GMTrace.i(10889889579008L, 81136);
        if (this.hvo != null)
        {
          this.hvo.setImageDrawable(null);
          this.hvo.setVisibility(8);
        }
        if (this.hvp != null)
        {
          this.hvp.setText("");
          this.hvp.setVisibility(8);
        }
        GMTrace.o(10889889579008L, 81136);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/EnterpriseBizContactPlainListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */