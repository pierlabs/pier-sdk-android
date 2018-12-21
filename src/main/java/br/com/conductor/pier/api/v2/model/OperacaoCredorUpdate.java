package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object OperationCreditor
 **/
@ApiModel(description = "Object OperationCreditor")
public class OperacaoCredorUpdate  {
  
  @SerializedName("idOperacao")
  private Long idOperacao = null;
  @SerializedName("idGrupoEconomico")
  private Long idGrupoEconomico = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("remuneracaoPercentual")
  private BigDecimal remuneracaoPercentual = null;
  @SerializedName("remuneracaoFixa")
  private BigDecimal remuneracaoFixa = null;
  public enum PeriodicidadeEnum {
     DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
  };
  @SerializedName("periodicidade")
  private PeriodicidadeEnum periodicidade = null;
  @SerializedName("vencimentoPrimeiraParcela")
  private Integer vencimentoPrimeiraParcela = null;
  @SerializedName("diasAfastamento")
  private Integer diasAfastamento = null;
  public enum FatorMultiplicadorEnum {
     FORA_AGENDA,  AGENDA,  AGENDA_NEGATIVA, 
  };
  @SerializedName("fatorMultiplicador")
  private FatorMultiplicadorEnum fatorMultiplicador = null;
  @SerializedName("flagTaxaFixada")
  private Boolean flagTaxaFixada = null;
  @SerializedName("planoMinimo")
  private Integer planoMinimo = null;
  @SerializedName("planoMaximo")
  private Integer planoMaximo = null;

  
  /**
   * Show the Operation id
   **/
  @ApiModelProperty(required = true, value = "Show the Operation id")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Show the id of the Economic Group
   **/
  @ApiModelProperty(required = true, value = "Show the id of the Economic Group")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * Show the id of the product that will be updated
   **/
  @ApiModelProperty(value = "Show the id of the product that will be updated")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Remuneration Percentage
   **/
  @ApiModelProperty(value = "Remuneration Percentage")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * Remuneration Fixed
   **/
  @ApiModelProperty(value = "Remuneration Fixed")
  public BigDecimal getRemuneracaoFixa() {
    return remuneracaoFixa;
  }
  public void setRemuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
  }

  
  /**
   * Frequency (DAILY(1), WEEKLY(2), MONTHLY(3), DECENDIAL(4), BIWEEKLY(5))
   **/
  @ApiModelProperty(value = "Frequency (DAILY(1), WEEKLY(2), MONTHLY(3), DECENDIAL(4), BIWEEKLY(5))")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Expiration of the first parcel
   **/
  @ApiModelProperty(value = "Expiration of the first parcel")
  public Integer getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Clearance days
   **/
  @ApiModelProperty(value = "Clearance days")
  public Integer getDiasAfastamento() {
    return diasAfastamento;
  }
  public void setDiasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
  }

  
  /**
   * Multiplier Factor (OUR_SCHEDULE(0), SCHEDULE(1))
   **/
  @ApiModelProperty(value = "Multiplier Factor (OUR_SCHEDULE(0), SCHEDULE(1))")
  public FatorMultiplicadorEnum getFatorMultiplicador() {
    return fatorMultiplicador;
  }
  public void setFatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
  }

  
  /**
   * Flag taxe fixed
   **/
  @ApiModelProperty(value = "Flag taxe fixed")
  public Boolean getFlagTaxaFixada() {
    return flagTaxaFixada;
  }
  public void setFlagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
  }

  
  /**
   * Minimum plan of the rule
   **/
  @ApiModelProperty(required = true, value = "Minimum plan of the rule")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Maximum plan of the rule
   **/
  @ApiModelProperty(required = true, value = "Maximum plan of the rule")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoCredorUpdate {\n");
    
    sb.append("  idOperacao: ").append(idOperacao).append("\n");
    sb.append("  idGrupoEconomico: ").append(idGrupoEconomico).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  remuneracaoPercentual: ").append(remuneracaoPercentual).append("\n");
    sb.append("  remuneracaoFixa: ").append(remuneracaoFixa).append("\n");
    sb.append("  periodicidade: ").append(periodicidade).append("\n");
    sb.append("  vencimentoPrimeiraParcela: ").append(vencimentoPrimeiraParcela).append("\n");
    sb.append("  diasAfastamento: ").append(diasAfastamento).append("\n");
    sb.append("  fatorMultiplicador: ").append(fatorMultiplicador).append("\n");
    sb.append("  flagTaxaFixada: ").append(flagTaxaFixada).append("\n");
    sb.append("  planoMinimo: ").append(planoMinimo).append("\n");
    sb.append("  planoMaximo: ").append(planoMaximo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
