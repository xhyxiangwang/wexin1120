package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bt.g;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.d;
import com.tencent.mm.plugin.fts.a.c.a;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.f.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.n;
import java.util.List;
import java.util.regex.Pattern;

public final class k
  extends com.tencent.mm.plugin.fts.d.a.a
{
  public com.tencent.mm.plugin.fts.a.a.i iOg;
  public List<String> iOh;
  public x jqN;
  public CharSequence klY;
  public CharSequence klZ;
  public CharSequence pox;
  private b poy;
  a poz;
  public String username;
  
  public k(int paramInt)
  {
    super(2, paramInt);
    GMTrace.i(11844848713728L, 88251);
    this.poy = new b();
    this.poz = new a();
    GMTrace.o(11844848713728L, 88251);
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vk()
  {
    GMTrace.i(16474152370176L, 122742);
    b localb = this.poy;
    GMTrace.o(16474152370176L, 122742);
    return localb;
  }
  
  protected final a.a Vl()
  {
    GMTrace.i(18367159205888L, 136846);
    a locala = this.poz;
    GMTrace.o(18367159205888L, 136846);
    return locala;
  }
  
  public final int Vn()
  {
    GMTrace.i(11845251366912L, 88254);
    int i = this.iOg.mkP;
    GMTrace.o(11845251366912L, 88254);
    return i;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16474018152448L, 122741);
    this.username = this.iOg.mkj;
    ap.AS();
    this.jqN = c.yL().SL(this.username);
    paramVarArgs = this.iOh;
    Object localObject2 = paramContext.getResources();
    parama = this.jqN;
    Object localObject1 = n.a(parama, parama.field_username);
    boolean bool2;
    int i;
    switch (this.iOg.hJy)
    {
    default: 
      bool2 = false;
      i = 0;
      parama = null;
      bool1 = false;
      if (i != 0)
      {
        this.klY = h.c(paramContext, (CharSequence)localObject1, d.b.mmV);
        this.klY = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klY, this.fIW, paramVarArgs, bool1, bool2, f.a.mnc, d.b.mmW)).mok;
        this.klZ = parama;
        GMTrace.o(16474018152448L, 122741);
        return;
      }
      break;
    case 3: 
    case 7: 
      label151:
      label202:
      bool2 = true;
    }
    label219:
    for (boolean bool1 = true;; bool1 = false)
    {
      this.klZ = parama.field_nickname;
      parama = null;
      i = 1;
      break label151;
      ap.AS();
      Cursor localCursor = c.yI().a("SELECT memberlist FROM chatroom WHERE chatroomname=?;", new String[] { parama.field_username }, 2);
      if (localCursor.moveToFirst())
      {
        parama = localCursor.getString(0);
        if (parama == null) {
          parama = null;
        }
      }
      for (;;)
      {
        localCursor.close();
        if ((parama != null) && (parama.length > 0)) {
          this.pox = ("(" + parama.length + ")");
        }
        if ((parama == null) || (this.iOg.mkN == null)) {
          break;
        }
        parama = e.a(paramContext, this.iOg.mkN, parama, paramVarArgs, d.b.mmY, this.fIW);
        parama = TextUtils.concat(new CharSequence[] { ((Resources)localObject2).getString(R.l.eEp), parama });
        bool2 = false;
        i = 0;
        bool1 = false;
        break label151;
        parama = c.a.mjS.split(parama);
        continue;
        this.klY = h.c(paramContext, (CharSequence)localObject1, d.b.mmV);
        paramContext = this.klY;
        paramVarArgs = this.pox;
        float f = f.a.mnc;
        localObject1 = d.b.mmW;
        localObject2 = TextUtils.TruncateAt.END;
        this.klY = TextUtils.concat(new CharSequence[] { TextUtils.ellipsize(paramContext, (TextPaint)localObject1, f - ((TextPaint)localObject1).measureText(paramVarArgs.toString()), (TextUtils.TruncateAt)localObject2), paramVarArgs });
        break label202;
        parama = null;
      }
      bool2 = false;
      break label219;
      bool2 = false;
    }
  }
  
  public final int aBG()
  {
    GMTrace.i(11845385584640L, 88255);
    if (this.iOg.hJy == 38)
    {
      List localList = this.iOg.mkN;
      if ((localList != null) && (localList.size() > 0))
      {
        i = ((d)localList.get(0)).hJy;
        GMTrace.o(11845385584640L, 88255);
        return i;
      }
    }
    int i = super.aBG();
    GMTrace.o(11845385584640L, 88255);
    return i;
  }
  
  public final boolean aBH()
  {
    GMTrace.i(11845519802368L, 88256);
    boolean bool = this.iOg.mkQ;
    GMTrace.o(11845519802368L, 88256);
    return bool;
  }
  
  public final class a
    extends a.a
  {
    public View iiK;
    public ImageView iiL;
    public TextView iiM;
    public TextView iiN;
    
    public a()
    {
      super();
      GMTrace.i(11850485858304L, 88293);
      GMTrace.o(11850485858304L, 88293);
    }
  }
  
  public final class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(11850888511488L, 88296);
      GMTrace.o(11850888511488L, 88296);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(11851022729216L, 88297);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVs, paramViewGroup, false);
      paramViewGroup = (k.a)k.this.poz;
      paramViewGroup.iiL = ((ImageView)paramContext.findViewById(R.h.bjt));
      paramViewGroup.iiM = ((TextView)paramContext.findViewById(R.h.cBJ));
      paramViewGroup.iiN = ((TextView)paramContext.findViewById(R.h.bAy));
      paramViewGroup.iiK = paramContext.findViewById(R.h.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(11851022729216L, 88297);
      return paramContext;
    }
    
    public final void a(Context paramContext, a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16469991620608L, 122711);
      parama = (k.a)parama;
      paramVarArgs = (k)paramVarArgs;
      cj(parama.iiK);
      if ((paramVarArgs.username != null) && (paramVarArgs.username.length() > 0)) {
        com.tencent.mm.pluginsdk.ui.a.b.a(parama.iiL, paramVarArgs.username);
      }
      for (;;)
      {
        parama.iiM.setText(paramVarArgs.klY);
        parama.iiM.setMaxWidth(com.tencent.mm.bq.a.fromDPToPix(paramContext, 200));
        e.a(paramVarArgs.klZ, parama.iiN);
        GMTrace.o(16469991620608L, 122711);
        return;
        parama.iiL.setImageResource(R.g.aYg);
      }
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16470125838336L, 122712);
      paramVarArgs = (k)paramVarArgs;
      a(k.this.fIW, paramVarArgs.iOg);
      paramVarArgs = new Intent().putExtra("Chat_User", paramVarArgs.username).putExtra("finish_direct", true);
      com.tencent.mm.plugin.search.a.ifM.e(paramVarArgs, paramContext);
      GMTrace.o(16470125838336L, 122712);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */