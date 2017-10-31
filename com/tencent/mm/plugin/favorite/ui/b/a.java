package com.tencent.mm.plugin.favorite.ui.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.b.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.e;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.f.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.su;
import com.tencent.mm.protocal.c.sw;
import com.tencent.mm.protocal.c.sy;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.o;
import com.tencent.mm.x.x.a;
import com.tencent.mm.x.x.b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  extends com.tencent.mm.plugin.fts.d.a.a
{
  private static final ae handler;
  private static final Pattern lWV;
  public i iOg;
  public List<String> iOh;
  public String iVM;
  public CharSequence lWW;
  public CharSequence lWX;
  public CharSequence lWY;
  public String lWZ;
  public int lXa;
  private b lXb;
  a lXc;
  
  static
  {
    GMTrace.i(6439229718528L, 47976);
    lWV = Pattern.compile("['\r\n' | '\n']+");
    handler = new ae(Looper.getMainLooper());
    GMTrace.o(6439229718528L, 47976);
  }
  
  public a(int paramInt)
  {
    super(7, paramInt);
    GMTrace.i(6438290194432L, 47969);
    this.lXb = new b();
    this.lXc = new a();
    GMTrace.o(6438290194432L, 47969);
  }
  
  private static String a(x paramx, boolean paramBoolean)
  {
    GMTrace.i(6438692847616L, 47972);
    if ((paramBoolean) && (!bg.mZ(paramx.field_conRemark))) {}
    for (String str1 = paramx.field_conRemark;; str1 = paramx.field_nickname)
    {
      String str2 = str1;
      if (bg.mZ(str1)) {
        str2 = paramx.field_username;
      }
      GMTrace.o(6438692847616L, 47972);
      return str2;
    }
  }
  
  public static void a(TextView paramTextView1, TextView paramTextView2, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    GMTrace.i(6438155976704L, 47968);
    if (e.a(paramCharSequence1, paramTextView1))
    {
      if (e.a(paramCharSequence2, paramTextView2))
      {
        paramTextView1.setMaxLines(1);
        paramTextView2.setMaxLines(1);
        GMTrace.o(6438155976704L, 47968);
        return;
      }
      paramTextView1.setMaxLines(2);
      GMTrace.o(6438155976704L, 47968);
      return;
    }
    if (e.a(paramCharSequence2, paramTextView2)) {
      paramTextView2.setMaxLines(2);
    }
    GMTrace.o(6438155976704L, 47968);
  }
  
  private static String c(Context paramContext, x paramx)
  {
    GMTrace.i(6438827065344L, 47973);
    String str2 = paramx.field_conRemark;
    String str1 = str2;
    if (bg.mZ(str2)) {
      str1 = paramx.field_nickname;
    }
    paramx = str1;
    if (bg.mZ(str1)) {
      paramx = paramContext.getString(R.l.ebD);
    }
    GMTrace.o(6438827065344L, 47973);
    return paramx;
  }
  
  private static String g(List<String> paramList1, List<String> paramList2)
  {
    GMTrace.i(6438961283072L, 47974);
    StringBuffer localStringBuffer = new StringBuffer();
    paramList2 = paramList2.iterator();
    while (paramList2.hasNext())
    {
      String str1 = ((String)paramList2.next()).toLowerCase();
      Iterator localIterator = paramList1.iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        if (str2.toLowerCase().contains(str1))
        {
          localStringBuffer.append(str2);
          localStringBuffer.append(" ");
        }
      }
    }
    localStringBuffer.trimToSize();
    paramList1 = localStringBuffer.toString();
    GMTrace.o(6438961283072L, 47974);
    return paramList1;
  }
  
  public final com.tencent.mm.plugin.fts.d.a.a.b Vk()
  {
    GMTrace.i(16649709158400L, 124050);
    b localb = this.lXb;
    GMTrace.o(16649709158400L, 124050);
    return localb;
  }
  
  protected final com.tencent.mm.plugin.fts.d.a.a.a Vl()
  {
    GMTrace.i(18032554409984L, 134353);
    a locala = this.lXc;
    GMTrace.o(18032554409984L, 134353);
    return locala;
  }
  
  public final int Vn()
  {
    GMTrace.i(6439095500800L, 47975);
    int i = this.iOg.mkP;
    GMTrace.o(6439095500800L, 47975);
    return i;
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16649574940672L, 124049);
    long l = this.iOg.mkG;
    parama = new fr();
    parama.fBn.type = 9;
    parama.fBn.fwq = l;
    com.tencent.mm.sdk.b.a.uLm.m(parama);
    su localsu = parama.fBo.fBy;
    l = this.iOg.mkG;
    parama = new fr();
    parama.fBn.type = 11;
    parama.fBn.fwq = l;
    parama.fBn.handler = handler;
    com.tencent.mm.sdk.b.a.uLm.m(parama);
    this.lWZ = bg.ap(parama.fBo.fBx, "");
    this.iVM = bg.ap(parama.fBo.thumbUrl, "");
    Object localObject1 = this.iOg;
    Object localObject2 = this.iOh;
    float f = f.a.mnc * 2;
    Object localObject3 = localsu.fKs;
    parama = "";
    label308:
    int i;
    switch (localsu.type)
    {
    case 5: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 15: 
    default: 
      parama = localsu.title;
      switch (((i)localObject1).hJy)
      {
      default: 
        this.lWW = parama;
        localObject2 = this.iOg;
        localObject1 = this.iOh;
        localObject3 = localsu.fKs;
        parama = "";
        i = -1;
        switch (localsu.type)
        {
        case 3: 
        case 4: 
        case 8: 
        case 9: 
        case 13: 
        default: 
          label416:
          parama = "";
          label420:
          switch (((i)localObject2).hJy)
          {
          default: 
            localObject1 = "";
            paramVarArgs = parama;
            parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
            label478:
            localObject1 = parama;
            if (i != -1)
            {
              localObject1 = parama;
              if (!bg.mZ(paramVarArgs)) {
                localObject1 = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(i), parama });
              }
            }
            this.lWX = ((CharSequence)localObject1);
            localObject3 = this.iOg;
            localObject2 = this.iOh;
            paramVarArgs = localsu.fFB;
            parama = localsu.tQq;
            if (bg.mZ(paramVarArgs))
            {
              localObject1 = null;
              paramVarArgs = parama;
              parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
            }
            break;
          }
          break;
        }
        break;
      }
      break;
    }
    for (;;)
    {
      if (bg.mZ(paramVarArgs))
      {
        paramContext = new SpannableString("");
        this.lWY = paramContext;
      }
      switch (localsu.type)
      {
      case 7: 
      default: 
        i = R.k.doC;
        this.lXa = i;
        GMTrace.o(16649574940672L, 124049);
        return;
        parama = lWV.matcher(localsu.desc).replaceAll(" ");
        break;
        parama = paramContext.getResources().getString(R.l.eEE);
        break;
        if (!bg.mZ(((sz)localObject3).iDL))
        {
          paramVarArgs = ((sz)localObject3).iDL;
          parama = paramVarArgs;
          if (((sz)localObject3).tPL == null) {
            break;
          }
          parama = paramVarArgs;
          if (bg.mZ(((sz)localObject3).tPL.fJh)) {
            break;
          }
          parama = paramVarArgs + "(" + ((sz)localObject3).tPL.fJh + ")";
          break;
        }
        if (((sz)localObject3).tPL != null)
        {
          paramVarArgs = ((sz)localObject3).tPL.fJh;
          parama = paramVarArgs;
          if (!bg.mZ(paramVarArgs)) {
            break;
          }
          parama = ((sz)localObject3).tPL.label;
          break;
        }
        parama = localsu.desc;
        break;
        parama = paramContext.getResources().getString(R.l.eEI);
        break;
        parama = paramContext.getResources().getString(R.l.eEJ);
        break;
        if (((sz)localObject3).tPP == null) {
          break;
        }
        parama = ((sz)localObject3).tPP.title;
        break;
        parama = new StringBuffer();
        paramVarArgs = ((sz)localObject3).tQC.iterator();
        while (paramVarArgs.hasNext())
        {
          localObject3 = com.tencent.mm.pluginsdk.model.c.p((sp)paramVarArgs.next());
          if (!bg.mZ((String)localObject3))
          {
            parama.append((String)localObject3);
            parama.append(" ");
          }
        }
        paramVarArgs = lWV.matcher(parama.toString()).replaceAll(" ");
        parama = paramVarArgs;
        if (!bg.mZ(paramVarArgs)) {
          break;
        }
        parama = paramContext.getResources().getString(R.l.eEG);
        break;
        paramVarArgs = localsu.title;
        parama = paramVarArgs;
        if (bg.mZ(localsu.desc)) {
          break;
        }
        parama = paramVarArgs + "-" + localsu.desc;
        break;
        parama = paramContext.getResources().getString(R.l.eEH);
        break;
        parama = f.b(com.tencent.mm.plugin.fts.d.b.a.a(parama, this.fIW, (List)localObject2, f, d.b.mmY)).mok;
        break label308;
        if (bg.mZ(localsu.appId)) {
          break label420;
        }
        parama = x.a.hfp.m(paramContext, localsu.appId);
        break label420;
        parama = localsu.title;
        break label420;
        if (((sz)localObject3).tPL == null) {
          break label420;
        }
        paramVarArgs = ((sz)localObject3).tPL.label;
        parama = paramVarArgs;
        if (!bg.mZ(((sz)localObject3).iDL)) {
          break label420;
        }
        parama = paramVarArgs;
        if (!bg.mZ(((sz)localObject3).tPL.fJh)) {
          break label420;
        }
        break label416;
        if (((sz)localObject3).tPP == null) {
          break label420;
        }
        parama = ((sz)localObject3).tPP.desc;
        break label420;
        parama = "";
        break label420;
        i = R.l.eED;
        localObject1 = f.b(com.tencent.mm.plugin.fts.d.b.a.b(parama, (List)localObject1)).mok;
        paramVarArgs = parama;
        parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
        break label478;
        i = R.l.eEF;
        paramVarArgs = g(localsu.tQr, (List)localObject1);
        parama = f.b(com.tencent.mm.plugin.fts.d.b.a.b(paramVarArgs, (List)localObject1)).mok;
        break label478;
        localObject1 = f.b(com.tencent.mm.plugin.fts.d.b.a.b(parama, (List)localObject1)).mok;
        paramVarArgs = parama;
        parama = (com.tencent.mm.plugin.fts.d.a.a.a)localObject1;
        break label478;
        ap.AS();
        localObject1 = com.tencent.mm.x.c.yL().SL(paramVarArgs);
        ((x)localObject1).setUsername(paramVarArgs);
        if ((o.dW(paramVarArgs)) && (!bg.mZ(parama)))
        {
          ap.AS();
          paramVarArgs = com.tencent.mm.x.c.yL().SL(parama);
          paramVarArgs.setUsername(parama);
        }
      case 8: 
      case 5: 
      case 3: 
      case 4: 
      case 6: 
        label637:
        for (parama = paramVarArgs;; parama = null)
        {
          boolean bool2 = false;
          boolean bool1 = false;
          label1385:
          label1423:
          label1462:
          boolean bool3;
          switch (((i)localObject3).hJy)
          {
          case 15: 
          default: 
            i = 0;
            bool2 = false;
            bool1 = false;
            if (parama != null)
            {
              parama = a(parama, true) + "-" + c(paramContext, (x)localObject1);
              parama = h.c(paramContext, parama, com.tencent.mm.bq.a.U(paramContext, R.f.aRQ));
              if (i == 0) {
                break label1684;
              }
              parama = f.b(com.tencent.mm.plugin.fts.d.b.a.a(parama, this.fIW, (List)localObject2, bool1, bool2)).mok;
              paramContext = TextUtils.concat(new CharSequence[] { paramContext.getResources().getString(R.l.eEj), parama });
            }
            break;
          case 14: 
            bool1 = true;
          case 13: 
            bool3 = true;
            bool2 = bool1;
          case 11: 
          case 18: 
          case 10: 
          case 17: 
          case 9: 
          case 16: 
          case 12: 
            for (bool1 = bool3;; bool1 = false)
            {
              if (parama != null) {}
              for (parama = a(parama, false) + "-" + c(paramContext, (x)localObject1);; parama = a((x)localObject1, false))
              {
                i = 1;
                break;
              }
              bool2 = true;
              for (bool1 = true;; bool1 = false)
              {
                i = 1;
                break label1385;
                if (o.dW(((af)localObject1).field_username))
                {
                  parama = c(paramContext, (x)localObject1);
                  break label1423;
                }
                parama = a((x)localObject1, true);
                break label1423;
                if ((localsu.fKs.tQC == null) || (localsu.fKs.tQC.size() <= 0)) {
                  break;
                }
                i = com.tencent.mm.pluginsdk.c.Nd(((sp)localsu.fKs.tQC.get(0)).tOM);
                break label637;
                i = R.k.dlk;
                break label637;
                i = R.k.dlj;
                break label637;
                i = R.k.dlh;
                break label637;
                i = R.k.dkV;
                break label637;
                label1684:
                break label1462;
                bool2 = false;
              }
              bool2 = false;
            }
          }
        }
      }
    }
  }
  
  public final class a
    extends com.tencent.mm.plugin.fts.d.a.a.a
  {
    public View iiK;
    public TextView iiM;
    public MMImageView lXd;
    public TextView lXe;
    public TextView lXf;
    
    public a()
    {
      super();
      GMTrace.i(6436276928512L, 47954);
      GMTrace.o(6436276928512L, 47954);
    }
  }
  
  public final class b
    extends com.tencent.mm.plugin.fts.d.a.a.b
  {
    public b()
    {
      super();
      GMTrace.i(6435068968960L, 47945);
      GMTrace.o(6435068968960L, 47945);
    }
    
    public final View a(Context paramContext, ViewGroup paramViewGroup)
    {
      GMTrace.i(6435203186688L, 47946);
      paramContext = LayoutInflater.from(paramContext).inflate(R.i.cVw, paramViewGroup, false);
      paramViewGroup = (a.a)a.this.lXc;
      paramViewGroup.lXd = ((MMImageView)paramContext.findViewById(R.h.bjt));
      paramViewGroup.iiM = ((TextView)paramContext.findViewById(R.h.cBJ));
      paramViewGroup.lXe = ((TextView)paramContext.findViewById(R.h.bfU));
      paramViewGroup.lXf = ((TextView)paramContext.findViewById(R.h.czh));
      paramViewGroup.iiK = paramContext.findViewById(R.h.ctB);
      paramContext.setTag(paramViewGroup);
      GMTrace.o(6435203186688L, 47946);
      return paramContext;
    }
    
    public final void a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a.a parama, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16650648682496L, 124057);
      parama = (a.a)parama;
      paramVarArgs = (a)paramVarArgs;
      cj(parama.iiK);
      e.a(paramContext, parama.lXd, paramVarArgs.iVM, paramVarArgs.lWZ, paramVarArgs.lXa, parama.lXd.getMeasuredWidth(), parama.lXd.getMeasuredHeight());
      a.a(parama.iiM, parama.lXe, a.this.lWW, a.this.lWX);
      e.a(a.this.lWY, parama.lXf);
      GMTrace.o(16650648682496L, 124057);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16650782900224L, 124058);
      paramVarArgs = (a)paramVarArgs;
      fr localfr = new fr();
      localfr.fBn.type = 10;
      localfr.fBn.fwq = paramVarArgs.iOg.mkG;
      localfr.fBn.context = paramContext;
      com.tencent.mm.sdk.b.a.uLm.m(localfr);
      GMTrace.o(16650782900224L, 124058);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */