package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objecto de atualiza\u00E7\u00E3o de um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o
 **/
@ApiModel(description = "Objecto de atualiza\u00E7\u00E3o de um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o")
public class ParametroAcumuladorContaOperacaoUpdate  {
  
  @SerializedName("qtdOperacoesGratuitasDia")
  private Integer qtdOperacoesGratuitasDia = null;
  @SerializedName("qtdOperacoesGratuitasSemana")
  private Integer qtdOperacoesGratuitasSemana = null;
  @SerializedName("qtdOperacoesGratuitasMes")
  private Integer qtdOperacoesGratuitasMes = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia
   **/
  @ApiModelProperty(value = "Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia")
  public Integer getQtdOperacoesGratuitasDia() {
    return qtdOperacoesGratuitasDia;
  }
  public void setQtdOperacoesGratuitasDia(Integer qtdOperacoesGratuitasDia) {
    this.qtdOperacoesGratuitasDia = qtdOperacoesGratuitasDia;
  }

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por semana
   **/
  @ApiModelProperty(value = "Quantidade de opera\u00E7\u00F5es gratuitas permitidas por semana")
  public Integer getQtdOperacoesGratuitasSemana() {
    return qtdOperacoesGratuitasSemana;
  }
  public void setQtdOperacoesGratuitasSemana(Integer qtdOperacoesGratuitasSemana) {
    this.qtdOperacoesGratuitasSemana = qtdOperacoesGratuitasSemana;
  }

  
  /**
   * Quantidade de opera\u00E7\u00F5es gratuitas permitidas por m\u00EAs
   **/
  @ApiModelProperty(value = "Quantidade de opera\u00E7\u00F5es gratuitas permitidas por m\u00EAs")
  public Integer getQtdOperacoesGratuitasMes() {
    return qtdOperacoesGratuitasMes;
  }
  public void setQtdOperacoesGratuitasMes(Integer qtdOperacoesGratuitasMes) {
    this.qtdOperacoesGratuitasMes = qtdOperacoesGratuitasMes;
  }

  
  /**
   * Valor da taxa de abertura de cr\u00E9dito (TAC)
   **/
  @ApiModelProperty(value = "Valor da taxa de abertura de cr\u00E9dito (TAC)")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametroAcumuladorContaOperacaoUpdate {\n");
    
    sb.append("  qtdOperacoesGratuitasDia: ").append(qtdOperacoesGratuitasDia).append("\n");
    sb.append("  qtdOperacoesGratuitasSemana: ").append(qtdOperacoesGratuitasSemana).append("\n");
    sb.append("  qtdOperacoesGratuitasMes: ").append(qtdOperacoesGratuitasMes).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
