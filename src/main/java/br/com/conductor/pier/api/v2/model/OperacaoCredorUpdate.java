package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto OperacaoCredor
 **/
@ApiModel(description = "Objeto OperacaoCredor")
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
     NENHUM,  DIARIO,  SEMANAL,  MENSAL,  DECENDIAL,  QUINZENAL, 
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
   * Apresenta o id da Opera\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Apresenta o id da Opera\u00E7\u00E3o")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * Apresenta o id do Grupo Econ\u00F4mico
   **/
  @ApiModelProperty(required = true, value = "Apresenta o id do Grupo Econ\u00F4mico")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * Apresenta o id do produto que vai ser alterado
   **/
  @ApiModelProperty(value = "Apresenta o id do produto que vai ser alterado")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Remunera\u00E7\u00E3o Percentual
   **/
  @ApiModelProperty(value = "Remunera\u00E7\u00E3o Percentual")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * Remunera\u00E7\u00E3o Fixa
   **/
  @ApiModelProperty(value = "Remunera\u00E7\u00E3o Fixa")
  public BigDecimal getRemuneracaoFixa() {
    return remuneracaoFixa;
  }
  public void setRemuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
  }

  
  /**
   * Periodicidade (DIARIO(1), SEMANAL(2), MENSAL(3), DECENDIAL(4), QUINZENAL(5))
   **/
  @ApiModelProperty(value = "Periodicidade (DIARIO(1), SEMANAL(2), MENSAL(3), DECENDIAL(4), QUINZENAL(5))")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * Vencimento da primeira parcela
   **/
  @ApiModelProperty(value = "Vencimento da primeira parcela")
  public Integer getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * Dias afastamento
   **/
  @ApiModelProperty(value = "Dias afastamento")
  public Integer getDiasAfastamento() {
    return diasAfastamento;
  }
  public void setDiasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
  }

  
  /**
   * Fator multiplicador (FORA_AGENDA(0), AGENDA(1))
   **/
  @ApiModelProperty(value = "Fator multiplicador (FORA_AGENDA(0), AGENDA(1))")
  public FatorMultiplicadorEnum getFatorMultiplicador() {
    return fatorMultiplicador;
  }
  public void setFatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
  }

  
  /**
   * Flag taxa fixada
   **/
  @ApiModelProperty(value = "Flag taxa fixada")
  public Boolean getFlagTaxaFixada() {
    return flagTaxaFixada;
  }
  public void setFlagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
  }

  
  /**
   * Plano m\u00EDnimo da regra
   **/
  @ApiModelProperty(required = true, value = "Plano m\u00EDnimo da regra")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * Plano m\u00E1ximo da regra
   **/
  @ApiModelProperty(required = true, value = "Plano m\u00E1ximo da regra")
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
