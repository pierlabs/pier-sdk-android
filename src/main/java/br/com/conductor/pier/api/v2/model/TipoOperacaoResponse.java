package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_operacao_response_description}}}
 **/
@ApiModel(description = "{{{tipo_operacao_response_description}}}")
public class TipoOperacaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("tipoOperacao")
  private String tipoOperacao = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("excedentePermitido")
  private BigDecimal excedentePermitido = null;
  @SerializedName("tipoExcedentePermitido")
  private String tipoExcedentePermitido = null;
  @SerializedName("valorMinimo")
  private BigDecimal valorMinimo = null;
  @SerializedName("valorMaximo")
  private BigDecimal valorMaximo = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("flagTiraTac")
  private Integer flagTiraTac = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("tarifa")
  private BigDecimal tarifa = null;
  @SerializedName("remuneracaoEmissor")
  private BigDecimal remuneracaoEmissor = null;
  @SerializedName("planoMaximo")
  private Integer planoMaximo = null;
  @SerializedName("planoMinimo")
  private Integer planoMinimo = null;

  
  /**
   * {{{tipo_operacao_response_id_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_operacao_response_tipo_operacao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_tipo_operacao_value}}}")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * {{{tipo_operacao_response_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{tipo_operacao_response_descricao_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{tipo_operacao_response_excedente_permitido_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_response_excedente_permitido_value}}}")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * {{{tipo_operacao_response_tipo_excedente_permitido_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_response_tipo_excedente_permitido_value}}}")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * {{{tipo_operacao_response_valor_minimo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_valor_minimo_value}}}")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * {{{tipo_operacao_response_valor_maximo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_valor_maximo_value}}}")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * {{{tipo_operacao_response_valor_t_a_c_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_response_valor_t_a_c_value}}}")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{tipo_operacao_response_flag_tira_tac_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_response_flag_tira_tac_value}}}")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   * {{{tipo_operacao_response_id_produto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{tipo_operacao_response_id_estabelecimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_id_estabelecimento_value}}}")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * {{{tipo_operacao_response_tarifa_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_response_tarifa_value}}}")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   * {{{tipo_operacao_response_remuneracao_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_operacao_response_remuneracao_emissor_value}}}")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   * {{{tipo_operacao_response_plano_maximo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_plano_maximo_value}}}")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * {{{tipo_operacao_response_plano_minimo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{tipo_operacao_response_plano_minimo_value}}}")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoOperacaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  tipoOperacao: ").append(tipoOperacao).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  excedentePermitido: ").append(excedentePermitido).append("\n");
    sb.append("  tipoExcedentePermitido: ").append(tipoExcedentePermitido).append("\n");
    sb.append("  valorMinimo: ").append(valorMinimo).append("\n");
    sb.append("  valorMaximo: ").append(valorMaximo).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  flagTiraTac: ").append(flagTiraTac).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  tarifa: ").append(tarifa).append("\n");
    sb.append("  remuneracaoEmissor: ").append(remuneracaoEmissor).append("\n");
    sb.append("  planoMaximo: ").append(planoMaximo).append("\n");
    sb.append("  planoMinimo: ").append(planoMinimo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
