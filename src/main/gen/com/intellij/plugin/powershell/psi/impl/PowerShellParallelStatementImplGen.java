// This is a generated file. Not intended for manual editing.
package com.intellij.plugin.powershell.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.plugin.powershell.psi.PowerShellTypes.*;
import com.intellij.plugin.powershell.psi.*;

public class PowerShellParallelStatementImplGen extends PowerShellPsiElementImpl implements PowerShellParallelStatement {

  public PowerShellParallelStatementImplGen(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PowerShellVisitor visitor) {
    visitor.visitParallelStatement(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PowerShellVisitor) accept((PowerShellVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PowerShellBlockBody getBlockBody() {
    return findChildByClass(PowerShellBlockBody.class);
  }

}