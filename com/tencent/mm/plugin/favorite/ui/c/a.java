package com.tencent.mm.plugin.favorite.ui.c;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.plugin.favorite.c.g;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.protocal.c.ta;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.x.ag.a;
import com.tencent.mm.x.ag.b;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.m;
import com.tencent.mm.x.n;
import com.tencent.mm.x.o;
import java.util.List;
import java.util.Map;

public abstract class a
{
  protected g lNK;
  public final a lXh;
  
  public a(g paramg)
  {
    GMTrace.i(6425673728000L, 47875);
    this.lNK = null;
    this.lXh = new a();
    this.lNK = paramg;
    GMTrace.o(6425673728000L, 47875);
  }
  
  public abstract View a(View paramView, ViewGroup paramViewGroup, j paramj);
  
  protected final View a(View paramView, b paramb, j paramj)
  {
    GMTrace.i(6426076381184L, 47878);
    if (paramView == null) {
      throw new NullPointerException("base item view is null");
    }
    paramb.iiL = ((ImageView)paramView.findViewById(R.h.bGx));
    if (paramb.iiL == null) {
      throw new IllegalArgumentException("base item view do not contain id named fav_avatar");
    }
    paramb.kIZ = ((TextView)paramView.findViewById(R.h.bHi));
    if (paramb.kIZ == null) {
      throw new IllegalArgumentException("base item view do not contain id named fav_name");
    }
    paramb.kGW = ((TextView)paramView.findViewById(R.h.bHw));
    if (paramb.kGW == null) {
      throw new IllegalArgumentException("base item view do not contain id named fav_time");
    }
    paramb.iiO = ((CheckBox)paramView.findViewById(R.h.bGC));
    if (paramb.iiO == null) {
      throw new IllegalArgumentException("base item view do not contain id named checkbox");
    }
    paramb.lXk = ((TextView)paramView.findViewById(R.h.bHd));
    paramb.iiO.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        GMTrace.i(6427955429376L, 47892);
        if (paramAnonymousCompoundButton.getTag() == null)
        {
          GMTrace.o(6427955429376L, 47892);
          return;
        }
        paramAnonymousCompoundButton = (j)paramAnonymousCompoundButton.getTag();
        if (paramAnonymousBoolean)
        {
          j localj = com.tencent.mm.plugin.favorite.h.awD().cc(paramAnonymousCompoundButton.field_localId);
          a.this.lXh.lTx.put(Long.valueOf(paramAnonymousCompoundButton.field_localId), localj);
        }
        for (;;)
        {
          if (a.this.lXh.lXj != null) {
            a.this.lXh.lXj.cr(paramAnonymousCompoundButton.field_localId);
          }
          GMTrace.o(6427955429376L, 47892);
          return;
          a.this.lXh.lTx.remove(Long.valueOf(paramAnonymousCompoundButton.field_localId));
        }
      }
    });
    paramb.lPM = paramj;
    paramView.setTag(paramb);
    paramb.lXl = ((LinearLayout)paramView.findViewById(R.h.bHr));
    paramb.lXm = ((TextView)paramView.findViewById(R.h.bHq));
    paramb.lXm.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6423123591168L, 47856);
        w.d("MicroMsg.FavBaseListItem", "manual restart upload");
        if ((paramAnonymousView.getTag() instanceof j)) {
          com.tencent.mm.plugin.favorite.b.x.l((j)paramAnonymousView.getTag());
        }
        GMTrace.o(6423123591168L, 47856);
      }
    });
    GMTrace.o(6426076381184L, 47878);
    return paramView;
  }
  
  protected final void a(b paramb, j paramj)
  {
    GMTrace.i(6426210598912L, 47879);
    paramb.lPM = paramj;
    Object localObject = paramb.lPM.field_favProto.tQA;
    label87:
    Context localContext;
    label231:
    boolean bool;
    if ((localObject != null) && (!bg.mZ(((ta)localObject).tQf)))
    {
      com.tencent.mm.pluginsdk.ui.a.b.n(paramb.iiL, ((ta)localObject).tQf);
      if (this.lXh.lTE) {
        break label411;
      }
      paramb.kGW.setText(u.e(paramb.kGW.getContext(), paramb.lPM.field_updateTime));
      localContext = paramb.kIZ.getContext();
      ap.AS();
      localObject = com.tencent.mm.x.c.yL().SK(paramb.lPM.field_fromUser);
      if ((localObject != null) && (((af)localObject).field_username.equals(paramb.lPM.field_fromUser))) {
        break label431;
      }
      w.w("MicroMsg.FavBaseListItem", "render name, user is %s, but name is null", new Object[] { paramb.lPM.field_fromUser });
      paramb.kIZ.setText("");
      ag.a.hfr.a(paramb.lPM.field_fromUser, "", null);
      w.d("MicroMsg.FavBaseListItem", "status %s", new Object[] { Integer.valueOf(paramb.lPM.field_itemStatus) });
      if (!paramb.lPM.awM()) {
        break label532;
      }
      paramb.lXl.setVisibility(0);
      paramb.iiO.setTag(paramj);
      if ((!this.lXh.lTw) && (!this.lXh.lTE)) {
        break label549;
      }
      paramb.iiO.setVisibility(0);
      localObject = paramb.iiO;
      if (this.lXh.lTx.get(Long.valueOf(paramj.field_localId)) == null) {
        break label544;
      }
      bool = true;
      label297:
      ((CheckBox)localObject).setChecked(bool);
      label303:
      if ((paramj.field_tagProto.tQM == null) || (paramj.field_tagProto.tQM.isEmpty())) {
        break label561;
      }
      paramb.lXk.setVisibility(0);
      paramb.lXk.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramb.lXk.getContext(), com.tencent.mm.plugin.favorite.b.x.a(paramb.lXk.getContext(), paramj.field_tagProto.tQM), paramb.lXk.getTextSize()));
    }
    for (;;)
    {
      paramb.lXm.setTag(paramj);
      GMTrace.o(6426210598912L, 47879);
      return;
      com.tencent.mm.pluginsdk.ui.a.b.n(paramb.iiL, paramb.lPM.field_fromUser);
      break;
      label411:
      paramb.kGW.setText(com.tencent.mm.plugin.favorite.c.bY(paramb.lPM.field_datatotalsize));
      break label87;
      label431:
      if (o.dW(paramb.lPM.field_fromUser))
      {
        localObject = paramb.lPM.field_favProto.tQA;
        if (m.zF().equals(((ta)localObject).fFB)) {
          localObject = n.fc(((ta)localObject).toUser);
        }
      }
      for (;;)
      {
        paramb.kIZ.setText(com.tencent.mm.pluginsdk.ui.d.h.b(localContext, (CharSequence)localObject, paramb.kIZ.getTextSize()));
        break;
        localObject = n.fc(((ta)localObject).fFB);
        continue;
        localObject = n.a((com.tencent.mm.storage.x)localObject, ((af)localObject).field_username);
      }
      label532:
      paramb.lXl.setVisibility(8);
      break label231;
      label544:
      bool = false;
      break label297;
      label549:
      paramb.iiO.setVisibility(8);
      break label303;
      label561:
      paramb.lXk.setVisibility(8);
    }
  }
  
  public abstract void ci(View paramView);
  
  public static final class a
  {
    public String kGt;
    public boolean kkg;
    public boolean lTE;
    public boolean lTw;
    public Map<Long, j> lTx;
    public a.c lXj;
    public long lastUpdateTime;
    
    public a()
    {
      GMTrace.i(6434129444864L, 47938);
      GMTrace.o(6434129444864L, 47938);
    }
    
    public final String toString()
    {
      GMTrace.i(6434263662592L, 47939);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("lastUpdateTime:").append(this.lastUpdateTime).append('\n');
      ((StringBuilder)localObject).append("isSearching:").append(this.kkg).append('\n');
      ((StringBuilder)localObject).append("search str:").append(this.kGt).append('\n');
      localObject = ((StringBuilder)localObject).toString();
      GMTrace.o(6434263662592L, 47939);
      return (String)localObject;
    }
  }
  
  public static class b
  {
    public ImageView iiL;
    public CheckBox iiO;
    public TextView kGW;
    public TextView kIZ;
    public j lPM;
    public TextView lXk;
    public LinearLayout lXl;
    public TextView lXm;
    
    public b()
    {
      GMTrace.i(6432653049856L, 47927);
      GMTrace.o(6432653049856L, 47927);
    }
  }
  
  public static abstract interface c
  {
    public abstract void cr(long paramLong);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */