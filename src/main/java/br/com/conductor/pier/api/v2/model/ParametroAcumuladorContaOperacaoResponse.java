package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objecto de resposta de um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o
 **/
@ApiModel(description = "Objecto de resposta de um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o")
public class ParametroAcumuladorContaOperacaoResponse  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("qtdOperacoesGratuitasDia")
  private Integer qtdOperacoesGratuitasDia = null;
  @SerializedName("qtdOperacoesGratuitasSemana")
  private Integer qtdOperacoesGratuitasSemana = null;
  @SerializedName("qtdOperacoesGratuitasMes")
  private Integer qtdOperacoesGratuitasMes = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
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
    sb.append("class ParametroAcumuladorContaOperacaoResponse {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  qtdOperacoesGratuitasDia: ").append(qtdOperacoesGratuitasDia).append("\n");
    sb.append("  qtdOperacoesGratuitasSemana: ").append(qtdOperacoesGratuitasSemana).append("\n");
    sb.append("  qtdOperacoesGratuitasMes: ").append(qtdOperacoesGratuitasMes).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
