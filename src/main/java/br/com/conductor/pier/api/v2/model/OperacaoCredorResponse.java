package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjectOperationCreditor
 **/
@ApiModel(description = "ObjectOperationCreditor")
public class OperacaoCredorResponse  {
  
  @SerializedName("id")
  private Long id = null;
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
   * Show the id of the OperationCreditor
   **/
  @ApiModelProperty(value = "Show the id of the OperationCreditor")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the id of the Operation
   **/
  @ApiModelProperty(value = "Show the id of the Operation")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Show the Economic Id group
   **/
  @ApiModelProperty(value = "Show the Economic Id group")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * Show the id of the product
   **/
  @ApiModelProperty(value = "Show the id of the product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Percentage Remunaration
   **/
  @ApiModelProperty(value = "Percentage Remunaration")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * Remuneration fixed
   **/
  @ApiModelProperty(value = "Remuneration fixed")
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
   * Removal days
   **/
  @ApiModelProperty(value = "Removal days")
  public Integer getDiasAfastamento() {
    return diasAfastamento;
  }
  public void setDiasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
  }

  
  /**
   * Factor Multiplier (OUT_SCHEDULE(0), SCHEDULE(1))
   **/
  @ApiModelProperty(value = "Factor Multiplier (OUT_SCHEDULE(0), SCHEDULE(1))")
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
   * Minimum Plan of the rule
   **/
  @ApiModelProperty(value = "Minimum Plan of the rule")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Maximum Plan of the rule
   **/
  @ApiModelProperty(value = "Maximum Plan of the rule")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperacaoCredorResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
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
