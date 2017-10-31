package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AtContactWidget
  extends LinearLayout
{
  private View iiK;
  private Activity owr;
  private ImageView qxB;
  private TextView qxC;
  private PreviewContactView qxD;
  SnsUploadConfigView qxE;
  private List<String> qxF;
  private boolean qxG;
  
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8597853437952L, 64059);
    this.qxF = new LinkedList();
    this.qxG = false;
    init(paramContext);
    GMTrace.o(8597853437952L, 64059);
  }
  
  @TargetApi(11)
  public AtContactWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8597719220224L, 64058);
    this.qxF = new LinkedList();
    this.qxG = false;
    init(paramContext);
    GMTrace.o(8597719220224L, 64058);
  }
  
  private void bkR()
  {
    GMTrace.i(8598524526592L, 64064);
    if (this.qxF.size() > 0)
    {
      this.qxB.setImageResource(bkS());
      GMTrace.o(8598524526592L, 64064);
      return;
    }
    this.qxB.setImageResource(bkT());
    GMTrace.o(8598524526592L, 64064);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8598256091136L, 64062);
    this.owr = ((Activity)paramContext);
    this.iiK = v.fa(paramContext).inflate(getLayoutResource(), this);
    this.qxD = ((PreviewContactView)this.iiK.findViewById(i.f.pJb));
    this.qxB = ((ImageView)this.iiK.findViewById(i.f.pJc));
    this.qxC = ((TextView)this.iiK.findViewById(i.f.pJd));
    this.iiK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8638924062720L, 64365);
        AtContactWidget.a(AtContactWidget.this);
        GMTrace.o(8638924062720L, 64365);
      }
    });
    GMTrace.o(8598256091136L, 64062);
  }
  
  public final boolean T(Intent paramIntent)
  {
    GMTrace.i(8598390308864L, 64063);
    paramIntent = paramIntent.getStringExtra("Select_Contact");
    new LinkedList();
    if ((paramIntent == null) || (paramIntent.equals(""))) {}
    for (paramIntent = new LinkedList();; paramIntent = bg.f(paramIntent.split(",")))
    {
      if (this.qxF == null) {
        this.qxF = new LinkedList();
      }
      this.qxF.clear();
      paramIntent = paramIntent.iterator();
      while (paramIntent.hasNext())
      {
        String str = (String)paramIntent.next();
        if (!this.qxF.contains(str)) {
          this.qxF.add(str);
        }
      }
    }
    if (this.qxD != null) {
      this.qxD.bz(this.qxF);
    }
    if (this.qxG)
    {
      w.d("MicroMsg.AtContactWiget", "withList count " + this.qxF.size());
      if ((!this.qxG) || (this.qxC == null) || (this.qxF.size() <= 0)) {
        break label297;
      }
      this.qxC.setVisibility(0);
      if (this.qxF.size() >= 100) {
        break label284;
      }
      this.qxC.setText(this.qxF.size());
    }
    for (;;)
    {
      bkR();
      GMTrace.o(8598390308864L, 64063);
      return true;
      label284:
      this.qxC.setText(i.j.eNy);
      continue;
      label297:
      this.qxC.setVisibility(8);
    }
  }
  
  public final List<String> bkP()
  {
    GMTrace.i(8597987655680L, 64060);
    if (this.qxF == null) {
      this.qxF = new LinkedList();
    }
    List localList = this.qxF;
    GMTrace.o(8597987655680L, 64060);
    return localList;
  }
  
  public final void bkQ()
  {
    GMTrace.i(8598121873408L, 64061);
    if (this.qxF == null) {
      this.qxF = new LinkedList();
    }
    this.qxF.clear();
    if (this.qxD != null) {
      this.qxD.bz(this.qxF);
    }
    bkR();
    if (this.qxC != null) {
      this.qxC.setVisibility(8);
    }
    GMTrace.o(8598121873408L, 64061);
  }
  
  protected int bkS()
  {
    GMTrace.i(8598792962048L, 64066);
    int i = i.i.pQE;
    GMTrace.o(8598792962048L, 64066);
    return i;
  }
  
  protected int bkT()
  {
    GMTrace.i(8598927179776L, 64067);
    int i = i.i.pQD;
    GMTrace.o(8598927179776L, 64067);
    return i;
  }
  
  protected int getLayoutResource()
  {
    GMTrace.i(8598658744320L, 64065);
    int i = i.g.pJe;
    GMTrace.o(8598658744320L, 64065);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/AtContactWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */