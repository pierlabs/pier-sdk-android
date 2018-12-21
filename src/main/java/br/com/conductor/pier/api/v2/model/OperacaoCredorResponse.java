package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{operacao_credor_response_description}}}
 **/
@ApiModel(description = "{{{operacao_credor_response_description}}}")
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
   * {{{operacao_credor_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{operacao_credor_response_id_operacao_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_id_operacao_value}}}")
  public Long getIdOperacao() {
    return idOperacao;
  }
  public void setIdOperacao(Long idOperacao) {
    this.idOperacao = idOperacao;
  }

  
  /**
   * {{{operacao_credor_response_id_grupo_economico_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_id_grupo_economico_value}}}")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * {{{operacao_credor_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{operacao_credor_response_remuneracao_percentual_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_remuneracao_percentual_value}}}")
  public BigDecimal getRemuneracaoPercentual() {
    return remuneracaoPercentual;
  }
  public void setRemuneracaoPercentual(BigDecimal remuneracaoPercentual) {
    this.remuneracaoPercentual = remuneracaoPercentual;
  }

  
  /**
   * {{{operacao_credor_response_remuneracao_fixa_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_remuneracao_fixa_value}}}")
  public BigDecimal getRemuneracaoFixa() {
    return remuneracaoFixa;
  }
  public void setRemuneracaoFixa(BigDecimal remuneracaoFixa) {
    this.remuneracaoFixa = remuneracaoFixa;
  }

  
  /**
   * {{{operacao_credor_response_periodicidade_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_periodicidade_value}}}")
  public PeriodicidadeEnum getPeriodicidade() {
    return periodicidade;
  }
  public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
    this.periodicidade = periodicidade;
  }

  
  /**
   * {{{operacao_credor_response_vencimento_primeira_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_vencimento_primeira_parcela_value}}}")
  public Integer getVencimentoPrimeiraParcela() {
    return vencimentoPrimeiraParcela;
  }
  public void setVencimentoPrimeiraParcela(Integer vencimentoPrimeiraParcela) {
    this.vencimentoPrimeiraParcela = vencimentoPrimeiraParcela;
  }

  
  /**
   * {{{operacao_credor_response_dias_afastamento_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_dias_afastamento_value}}}")
  public Integer getDiasAfastamento() {
    return diasAfastamento;
  }
  public void setDiasAfastamento(Integer diasAfastamento) {
    this.diasAfastamento = diasAfastamento;
  }

  
  /**
   * {{{operacao_credor_response_fator_multiplicador_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_fator_multiplicador_value}}}")
  public FatorMultiplicadorEnum getFatorMultiplicador() {
    return fatorMultiplicador;
  }
  public void setFatorMultiplicador(FatorMultiplicadorEnum fatorMultiplicador) {
    this.fatorMultiplicador = fatorMultiplicador;
  }

  
  /**
   * {{{operacao_credor_response_flag_taxa_fixada_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_flag_taxa_fixada_value}}}")
  public Boolean getFlagTaxaFixada() {
    return flagTaxaFixada;
  }
  public void setFlagTaxaFixada(Boolean flagTaxaFixada) {
    this.flagTaxaFixada = flagTaxaFixada;
  }

  
  /**
   * {{{operacao_credor_response_plano_minimo_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_plano_minimo_value}}}")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * {{{operacao_credor_response_plano_maximo_value}}}
   **/
  @ApiModelProperty(value = "{{{operacao_credor_response_plano_maximo_value}}}")
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
