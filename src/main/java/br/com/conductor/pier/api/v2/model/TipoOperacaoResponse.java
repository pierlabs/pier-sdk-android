package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso TipoOperacao
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso TipoOperacao")
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
  @SerializedName("idEmissor")
  private Integer idEmissor = null;
  @SerializedName("idTabela")
  private Integer idTabela = null;
  @SerializedName("valorParcela")
  private Integer valorParcela = null;
  @SerializedName("flagCobraProRata")
  private Integer flagCobraProRata = null;
  @SerializedName("flagCobraJuros")
  private Integer flagCobraJuros = null;
  @SerializedName("flagPosProximoVencimento")
  private Integer flagPosProximoVencimento = null;
  @SerializedName("percentualTAC")
  private Integer percentualTAC = null;
  @SerializedName("idTabelaJuros")
  private Integer idTabelaJuros = null;
  @SerializedName("codigoProcessamento")
  private String codigoProcessamento = null;

  
  /**
   * C\u00F3digo identificador do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do TipoOperacao")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo do TipoOperacao")
  public String getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(String tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Nome do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Nome do TipoOperacao")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Decri\u00E7\u00E3o do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Decri\u00E7\u00E3o do TipoOperacao")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Excedente permitido para o TipoOperacao
   **/
  @ApiModelProperty(value = "Excedente permitido para o TipoOperacao")
  public BigDecimal getExcedentePermitido() {
    return excedentePermitido;
  }
  public void setExcedentePermitido(BigDecimal excedentePermitido) {
    this.excedentePermitido = excedentePermitido;
  }

  
  /**
   * Tipo do Excedente permitido para o TipoOperacao
   **/
  @ApiModelProperty(value = "Tipo do Excedente permitido para o TipoOperacao")
  public String getTipoExcedentePermitido() {
    return tipoExcedentePermitido;
  }
  public void setTipoExcedentePermitido(String tipoExcedentePermitido) {
    this.tipoExcedentePermitido = tipoExcedentePermitido;
  }

  
  /**
   * Valor minimo para a transa\u00E7\u00E3o do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Valor minimo para a transa\u00E7\u00E3o do TipoOperacao")
  public BigDecimal getValorMinimo() {
    return valorMinimo;
  }
  public void setValorMinimo(BigDecimal valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  
  /**
   * Valor maximo para a transa\u00E7\u00E3o do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Valor maximo para a transa\u00E7\u00E3o do TipoOperacao")
  public BigDecimal getValorMaximo() {
    return valorMaximo;
  }
  public void setValorMaximo(BigDecimal valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  
  /**
   * Valor TAC da transa\u00E7\u00E3o do TipoOperacao
   **/
  @ApiModelProperty(value = "Valor TAC da transa\u00E7\u00E3o do TipoOperacao")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * Flag Tira TAC do TipoOperacao
   **/
  @ApiModelProperty(value = "Flag Tira TAC do TipoOperacao")
  public Integer getFlagTiraTac() {
    return flagTiraTac;
  }
  public void setFlagTiraTac(Integer flagTiraTac) {
    this.flagTiraTac = flagTiraTac;
  }

  
  /**
   * Identificador do Produto do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Identificador do Produto do TipoOperacao")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Identificador do Estabelecimento do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Identificador do Estabelecimento do TipoOperacao")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Tarifa do TipoOperacao
   **/
  @ApiModelProperty(value = "Tarifa do TipoOperacao")
  public BigDecimal getTarifa() {
    return tarifa;
  }
  public void setTarifa(BigDecimal tarifa) {
    this.tarifa = tarifa;
  }

  
  /**
   * Remunera\u00E7\u00E3o do Emissor para o TipoOperacao
   **/
  @ApiModelProperty(value = "Remunera\u00E7\u00E3o do Emissor para o TipoOperacao")
  public BigDecimal getRemuneracaoEmissor() {
    return remuneracaoEmissor;
  }
  public void setRemuneracaoEmissor(BigDecimal remuneracaoEmissor) {
    this.remuneracaoEmissor = remuneracaoEmissor;
  }

  
  /**
   * Plano m\u00E1ximo do TipoOperacao
   **/
  @ApiModelProperty(required = true, value = "Plano m\u00E1ximo do TipoOperacao")
  public Integer getPlanoMaximo() {
    return planoMaximo;
  }
  public void setPlanoMaximo(Integer planoMaximo) {
    this.planoMaximo = planoMaximo;
  }

  
  /**
   * Plano minimo do TipoOperacao
   **/
  @ApiModelProperty(value = "Plano minimo do TipoOperacao")
  public Integer getPlanoMinimo() {
    return planoMinimo;
  }
  public void setPlanoMinimo(Integer planoMinimo) {
    this.planoMinimo = planoMinimo;
  }

  
  /**
   * C\u00F3digo identificador do emissor
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do emissor")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * C\u00F3digo identificador da tabela
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tabela")
  public Integer getIdTabela() {
    return idTabela;
  }
  public void setIdTabela(Integer idTabela) {
    this.idTabela = idTabela;
  }

  
  /**
   * Valor da parcela
   **/
  @ApiModelProperty(value = "Valor da parcela")
  public Integer getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(Integer valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Flag cobra pr\u00F3-rata
   **/
  @ApiModelProperty(value = "Flag cobra pr\u00F3-rata")
  public Integer getFlagCobraProRata() {
    return flagCobraProRata;
  }
  public void setFlagCobraProRata(Integer flagCobraProRata) {
    this.flagCobraProRata = flagCobraProRata;
  }

  
  /**
   * Flag cobra juros
   **/
  @ApiModelProperty(value = "Flag cobra juros")
  public Integer getFlagCobraJuros() {
    return flagCobraJuros;
  }
  public void setFlagCobraJuros(Integer flagCobraJuros) {
    this.flagCobraJuros = flagCobraJuros;
  }

  
  /**
   * Flag p\u00F3s-pr\u00F3ximo vencimento
   **/
  @ApiModelProperty(value = "Flag p\u00F3s-pr\u00F3ximo vencimento")
  public Integer getFlagPosProximoVencimento() {
    return flagPosProximoVencimento;
  }
  public void setFlagPosProximoVencimento(Integer flagPosProximoVencimento) {
    this.flagPosProximoVencimento = flagPosProximoVencimento;
  }

  
  /**
   * Valor TAC
   **/
  @ApiModelProperty(value = "Valor TAC")
  public Integer getPercentualTAC() {
    return percentualTAC;
  }
  public void setPercentualTAC(Integer percentualTAC) {
    this.percentualTAC = percentualTAC;
  }

  
  /**
   * C\u00F3digo identificador da tabela de juros
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tabela de juros")
  public Integer getIdTabelaJuros() {
    return idTabelaJuros;
  }
  public void setIdTabelaJuros(Integer idTabelaJuros) {
    this.idTabelaJuros = idTabelaJuros;
  }

  
  /**
   * C\u00F3digo identificador de opera\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador de opera\u00E7\u00E3o")
  public String getCodigoProcessamento() {
    return codigoProcessamento;
  }
  public void setCodigoProcessamento(String codigoProcessamento) {
    this.codigoProcessamento = codigoProcessamento;
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
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  idTabela: ").append(idTabela).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  flagCobraProRata: ").append(flagCobraProRata).append("\n");
    sb.append("  flagCobraJuros: ").append(flagCobraJuros).append("\n");
    sb.append("  flagPosProximoVencimento: ").append(flagPosProximoVencimento).append("\n");
    sb.append("  percentualTAC: ").append(percentualTAC).append("\n");
    sb.append("  idTabelaJuros: ").append(idTabelaJuros).append("\n");
    sb.append("  codigoProcessamento: ").append(codigoProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
