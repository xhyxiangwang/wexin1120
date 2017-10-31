package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.i.k;
import com.tencent.mm.plugin.sns.model.b.b;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.dl;
import com.tencent.mm.protocal.c.dm;
import com.tencent.mm.ui.base.j;

public class ArtistHeader
  extends LinearLayout
  implements b.b
{
  Context context;
  private j lZi;
  private View ocG;
  dl qxa;
  a qxf;
  private ImageView qxg;
  private ProgressBar qxh;
  
  public ArtistHeader(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8668854616064L, 64588);
    this.qxa = null;
    this.lZi = null;
    this.context = null;
    init(paramContext);
    GMTrace.o(8668854616064L, 64588);
  }
  
  public ArtistHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8668988833792L, 64589);
    this.qxa = null;
    this.lZi = null;
    this.context = null;
    init(paramContext);
    GMTrace.o(8668988833792L, 64589);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8669123051520L, 64590);
    View localView = LayoutInflater.from(paramContext).inflate(i.g.pOC, this, true);
    this.context = paramContext;
    this.qxf = new a();
    this.qxf.iil = ((ImageView)localView.findViewById(i.f.pIZ));
    this.qxf.neZ = ((TextView)localView.findViewById(i.f.pHJ));
    this.qxf.qxk = ((TextView)localView.findViewById(i.f.pHM));
    this.qxf.qxl = ((TextView)localView.findViewById(i.f.pHK));
    this.qxf.iin = ((TextView)localView.findViewById(i.f.pHL));
    this.qxf.iil.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8354382479360L, 62245);
        if ((ArtistHeader.a(ArtistHeader.this) != null) && (ArtistHeader.a(ArtistHeader.this).isShowing()))
        {
          GMTrace.o(8354382479360L, 62245);
          return;
        }
        if (ArtistHeader.b(ArtistHeader.this) == null)
        {
          GMTrace.o(8354382479360L, 62245);
          return;
        }
        paramAnonymousView = LayoutInflater.from(ArtistHeader.this.getContext()).inflate(i.g.dhr, null);
        ArtistHeader.a(ArtistHeader.this, new j(ArtistHeader.this.getContext(), i.k.pUv));
        paramAnonymousView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymous2View)
          {
            GMTrace.i(8389950177280L, 62510);
            ArtistHeader.a(ArtistHeader.this).dismiss();
            GMTrace.o(8389950177280L, 62510);
          }
        });
        ArtistHeader.a(ArtistHeader.this).setCanceledOnTouchOutside(true);
        ArtistHeader.a(ArtistHeader.this).setContentView(paramAnonymousView);
        ArtistHeader.a(ArtistHeader.this).show();
        ArtistHeader.a(ArtistHeader.this, (ImageView)paramAnonymousView.findViewById(i.f.bOp));
        ArtistHeader.a(ArtistHeader.this, (ProgressBar)paramAnonymousView.findViewById(i.f.bOq));
        ArtistHeader.a(ArtistHeader.this, paramAnonymousView.findViewById(i.f.bOr));
        GMTrace.o(8354382479360L, 62245);
      }
    });
    GMTrace.o(8669123051520L, 64590);
  }
  
  public final void Gm(String paramString)
  {
    GMTrace.i(8669257269248L, 64591);
    GMTrace.o(8669257269248L, 64591);
  }
  
  public final void ar(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8669391486976L, 64592);
    if (this.qxa == null)
    {
      GMTrace.o(8669391486976L, 64592);
      return;
    }
    if ((this.lZi != null) && (this.lZi.isShowing()) && (!paramBoolean))
    {
      amn localamn = this.qxa.txf.txg;
      if ((localamn.nas != null) && (localamn.nas.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(i.j.pRY), 0).show();
        GMTrace.o(8669391486976L, 64592);
        return;
      }
    }
    GMTrace.o(8669391486976L, 64592);
  }
  
  public final void as(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8669525704704L, 64593);
    GMTrace.o(8669525704704L, 64593);
  }
  
  public final void bgh()
  {
    GMTrace.i(8669659922432L, 64594);
    GMTrace.o(8669659922432L, 64594);
  }
  
  final class a
  {
    ImageView iil;
    TextView iin;
    TextView neZ;
    TextView qxk;
    TextView qxl;
    
    a()
    {
      GMTrace.i(8427262705664L, 62788);
      GMTrace.o(8427262705664L, 62788);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/ArtistHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */