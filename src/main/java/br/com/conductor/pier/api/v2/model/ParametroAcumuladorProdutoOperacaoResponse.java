package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta de um par\u00E2metro acumulador de produto/opera\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto de resposta de um par\u00E2metro acumulador de produto/opera\u00E7\u00E3o")
public class ParametroAcumuladorProdutoOperacaoResponse  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("qtdMaxDia")
  private Integer qtdMaxDia = null;
  @SerializedName("qtdMaxSemana")
  private Integer qtdMaxSemana = null;
  @SerializedName("qtdMaxMes")
  private Integer qtdMaxMes = null;
  @SerializedName("valorMaxDia")
  private BigDecimal valorMaxDia = null;
  @SerializedName("valorMaxSemana")
  private BigDecimal valorMaxSemana = null;
  @SerializedName("valorMaxMes")
  private BigDecimal valorMaxMes = null;
  @SerializedName("qtdOperacoesGratuitasDia")
  private Integer qtdOperacoesGratuitasDia = null;
  @SerializedName("qtdOperacoesGratuitasSemana")
  private Integer qtdOperacoesGratuitasSemana = null;
  @SerializedName("qtdOperacoesGratuitasMes")
  private Integer qtdOperacoesGratuitasMes = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do produto
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do produto")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
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
   * Quantidade m\u00E1xima de opera\u00E7\u00F5es por dia
   **/
  @ApiModelProperty(value = "Quantidade m\u00E1xima de opera\u00E7\u00F5es por dia")
  public Integer getQtdMaxDia() {
    return qtdMaxDia;
  }
  public void setQtdMaxDia(Integer qtdMaxDia) {
    this.qtdMaxDia = qtdMaxDia;
  }

  
  /**
   * Quantidade m\u00E1xima de opera\u00E7\u00F5es por semana
   **/
  @ApiModelProperty(value = "Quantidade m\u00E1xima de opera\u00E7\u00F5es por semana")
  public Integer getQtdMaxSemana() {
    return qtdMaxSemana;
  }
  public void setQtdMaxSemana(Integer qtdMaxSemana) {
    this.qtdMaxSemana = qtdMaxSemana;
  }

  
  /**
   * Quantidade m\u00E1xima de opera\u00E7\u00F5es por m\u00EAs
   **/
  @ApiModelProperty(value = "Quantidade m\u00E1xima de opera\u00E7\u00F5es por m\u00EAs")
  public Integer getQtdMaxMes() {
    return qtdMaxMes;
  }
  public void setQtdMaxMes(Integer qtdMaxMes) {
    this.qtdMaxMes = qtdMaxMes;
  }

  
  /**
   * Valor m\u00E1ximo de opera\u00E7\u00F5es por dia
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo de opera\u00E7\u00F5es por dia")
  public BigDecimal getValorMaxDia() {
    return valorMaxDia;
  }
  public void setValorMaxDia(BigDecimal valorMaxDia) {
    this.valorMaxDia = valorMaxDia;
  }

  
  /**
   * Valor m\u00E1ximo de opera\u00E7\u00F5es por semana
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo de opera\u00E7\u00F5es por semana")
  public BigDecimal getValorMaxSemana() {
    return valorMaxSemana;
  }
  public void setValorMaxSemana(BigDecimal valorMaxSemana) {
    this.valorMaxSemana = valorMaxSemana;
  }

  
  /**
   * Valor m\u00E1ximo de opera\u00E7\u00F5es por m\u00EAs
   **/
  @ApiModelProperty(value = "Valor m\u00E1ximo de opera\u00E7\u00F5es por m\u00EAs")
  public BigDecimal getValorMaxMes() {
    return valorMaxMes;
  }
  public void setValorMaxMes(BigDecimal valorMaxMes) {
    this.valorMaxMes = valorMaxMes;
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
    sb.append("class ParametroAcumuladorProdutoOperacaoResponse {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  qtdMaxDia: ").append(qtdMaxDia).append("\n");
    sb.append("  qtdMaxSemana: ").append(qtdMaxSemana).append("\n");
    sb.append("  qtdMaxMes: ").append(qtdMaxMes).append("\n");
    sb.append("  valorMaxDia: ").append(valorMaxDia).append("\n");
    sb.append("  valorMaxSemana: ").append(valorMaxSemana).append("\n");
    sb.append("  valorMaxMes: ").append(valorMaxMes).append("\n");
    sb.append("  qtdOperacoesGratuitasDia: ").append(qtdOperacoesGratuitasDia).append("\n");
    sb.append("  qtdOperacoesGratuitasSemana: ").append(qtdOperacoesGratuitasSemana).append("\n");
    sb.append("  qtdOperacoesGratuitasMes: ").append(qtdOperacoesGratuitasMes).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
