package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_debito_recorrente_response_description}}}
 **/
@ApiModel(description = "{{{tipo_debito_recorrente_response_description}}}")
public class TipoDebitoRecorrenteResponse  {
  
  @SerializedName("flagAnuidadeBonificada")
  private Boolean flagAnuidadeBonificada = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("valorBonus")
  private BigDecimal valorBonus = null;
  @SerializedName("numeroParcelas")
  private Integer numeroParcelas = null;
  @SerializedName("flagAdereAutomatico")
  private Boolean flagAdereAutomatico = null;
  @SerializedName("flagGeraNumeroSorte")
  private Boolean flagGeraNumeroSorte = null;
  @SerializedName("faixaEtaria")
  private String faixaEtaria = null;
  @SerializedName("flagSeguro")
  private Boolean flagSeguro = null;
  @SerializedName("sorteiosMensais")
  private String sorteiosMensais = null;
  @SerializedName("flagAdesaoAutomatica")
  private Boolean flagAdesaoAutomatica = null;
  @SerializedName("flagDependente")
  private Boolean flagDependente = null;
  @SerializedName("quantidadeDependente")
  private Integer quantidadeDependente = null;
  @SerializedName("idTermoSeguroServico")
  private Long idTermoSeguroServico = null;
  @SerializedName("idadeMinima")
  private Integer idadeMinima = null;
  @SerializedName("idadeMaxima")
  private Integer idadeMaxima = null;
  @SerializedName("flagDebitoIncondicional")
  private Boolean flagDebitoIncondicional = null;
  @SerializedName("flagExtratoIncondicional")
  private Boolean flagExtratoIncondicional = null;
  @SerializedName("flagEstornoAutomatico")
  private Boolean flagEstornoAutomatico = null;
  @SerializedName("valorRepassadoSeguradora")
  private BigDecimal valorRepassadoSeguradora = null;
  @SerializedName("flagLancaTransacao")
  private Boolean flagLancaTransacao = null;
  @SerializedName("flagTransferenciaAutomatica")
  private Boolean flagTransferenciaAutomatica = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idGrupoDebitoRecorrente")
  private Long idGrupoDebitoRecorrente = null;
  @SerializedName("quantidadeTentativasCobranca")
  private Integer quantidadeTentativasCobranca = null;
  @SerializedName("idAjuste")
  private Long idAjuste = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getFlagAnuidadeBonificada() {
    return flagAnuidadeBonificada;
  }
  public void setFlagAnuidadeBonificada(Boolean flagAnuidadeBonificada) {
    this.flagAnuidadeBonificada = flagAnuidadeBonificada;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_descricao_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_valor_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_ativo_value}}}")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_valor_bonus_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_valor_bonus_value}}}")
  public BigDecimal getValorBonus() {
    return valorBonus;
  }
  public void setValorBonus(BigDecimal valorBonus) {
    this.valorBonus = valorBonus;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_numero_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_numero_parcelas_value}}}")
  public Integer getNumeroParcelas() {
    return numeroParcelas;
  }
  public void setNumeroParcelas(Integer numeroParcelas) {
    this.numeroParcelas = numeroParcelas;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_adere_automatico_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_adere_automatico_value}}}")
  public Boolean getFlagAdereAutomatico() {
    return flagAdereAutomatico;
  }
  public void setFlagAdereAutomatico(Boolean flagAdereAutomatico) {
    this.flagAdereAutomatico = flagAdereAutomatico;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_gera_numero_sorte_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_gera_numero_sorte_value}}}")
  public Boolean getFlagGeraNumeroSorte() {
    return flagGeraNumeroSorte;
  }
  public void setFlagGeraNumeroSorte(Boolean flagGeraNumeroSorte) {
    this.flagGeraNumeroSorte = flagGeraNumeroSorte;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_faixa_etaria_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_faixa_etaria_value}}}")
  public String getFaixaEtaria() {
    return faixaEtaria;
  }
  public void setFaixaEtaria(String faixaEtaria) {
    this.faixaEtaria = faixaEtaria;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_seguro_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_seguro_value}}}")
  public Boolean getFlagSeguro() {
    return flagSeguro;
  }
  public void setFlagSeguro(Boolean flagSeguro) {
    this.flagSeguro = flagSeguro;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_sorteios_mensais_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_sorteios_mensais_value}}}")
  public String getSorteiosMensais() {
    return sorteiosMensais;
  }
  public void setSorteiosMensais(String sorteiosMensais) {
    this.sorteiosMensais = sorteiosMensais;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_adesao_automatica_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_adesao_automatica_value}}}")
  public Boolean getFlagAdesaoAutomatica() {
    return flagAdesaoAutomatica;
  }
  public void setFlagAdesaoAutomatica(Boolean flagAdesaoAutomatica) {
    this.flagAdesaoAutomatica = flagAdesaoAutomatica;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_dependente_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_dependente_value}}}")
  public Boolean getFlagDependente() {
    return flagDependente;
  }
  public void setFlagDependente(Boolean flagDependente) {
    this.flagDependente = flagDependente;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_quantidade_dependente_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_quantidade_dependente_value}}}")
  public Integer getQuantidadeDependente() {
    return quantidadeDependente;
  }
  public void setQuantidadeDependente(Integer quantidadeDependente) {
    this.quantidadeDependente = quantidadeDependente;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_id_termo_seguro_servico_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_id_termo_seguro_servico_value}}}")
  public Long getIdTermoSeguroServico() {
    return idTermoSeguroServico;
  }
  public void setIdTermoSeguroServico(Long idTermoSeguroServico) {
    this.idTermoSeguroServico = idTermoSeguroServico;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_idade_minima_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_idade_minima_value}}}")
  public Integer getIdadeMinima() {
    return idadeMinima;
  }
  public void setIdadeMinima(Integer idadeMinima) {
    this.idadeMinima = idadeMinima;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_idade_maxima_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_idade_maxima_value}}}")
  public Integer getIdadeMaxima() {
    return idadeMaxima;
  }
  public void setIdadeMaxima(Integer idadeMaxima) {
    this.idadeMaxima = idadeMaxima;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_debito_incondicional_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_debito_incondicional_value}}}")
  public Boolean getFlagDebitoIncondicional() {
    return flagDebitoIncondicional;
  }
  public void setFlagDebitoIncondicional(Boolean flagDebitoIncondicional) {
    this.flagDebitoIncondicional = flagDebitoIncondicional;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_extrato_incondicional_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_extrato_incondicional_value}}}")
  public Boolean getFlagExtratoIncondicional() {
    return flagExtratoIncondicional;
  }
  public void setFlagExtratoIncondicional(Boolean flagExtratoIncondicional) {
    this.flagExtratoIncondicional = flagExtratoIncondicional;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_estorno_automatico_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_estorno_automatico_value}}}")
  public Boolean getFlagEstornoAutomatico() {
    return flagEstornoAutomatico;
  }
  public void setFlagEstornoAutomatico(Boolean flagEstornoAutomatico) {
    this.flagEstornoAutomatico = flagEstornoAutomatico;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_valor_repassado_seguradora_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_valor_repassado_seguradora_value}}}")
  public BigDecimal getValorRepassadoSeguradora() {
    return valorRepassadoSeguradora;
  }
  public void setValorRepassadoSeguradora(BigDecimal valorRepassadoSeguradora) {
    this.valorRepassadoSeguradora = valorRepassadoSeguradora;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_lanca_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_lanca_transacao_value}}}")
  public Boolean getFlagLancaTransacao() {
    return flagLancaTransacao;
  }
  public void setFlagLancaTransacao(Boolean flagLancaTransacao) {
    this.flagLancaTransacao = flagLancaTransacao;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_flag_transferencia_automatica_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_flag_transferencia_automatica_value}}}")
  public Boolean getFlagTransferenciaAutomatica() {
    return flagTransferenciaAutomatica;
  }
  public void setFlagTransferenciaAutomatica(Boolean flagTransferenciaAutomatica) {
    this.flagTransferenciaAutomatica = flagTransferenciaAutomatica;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_id_grupo_debito_recorrente_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_id_grupo_debito_recorrente_value}}}")
  public Long getIdGrupoDebitoRecorrente() {
    return idGrupoDebitoRecorrente;
  }
  public void setIdGrupoDebitoRecorrente(Long idGrupoDebitoRecorrente) {
    this.idGrupoDebitoRecorrente = idGrupoDebitoRecorrente;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_quantidade_tentativas_cobranca_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_quantidade_tentativas_cobranca_value}}}")
  public Integer getQuantidadeTentativasCobranca() {
    return quantidadeTentativasCobranca;
  }
  public void setQuantidadeTentativasCobranca(Integer quantidadeTentativasCobranca) {
    this.quantidadeTentativasCobranca = quantidadeTentativasCobranca;
  }

  
  /**
   * {{{tipo_debito_recorrente_response_id_ajuste_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_debito_recorrente_response_id_ajuste_value}}}")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDebitoRecorrenteResponse {\n");
    
    sb.append("  flagAnuidadeBonificada: ").append(flagAnuidadeBonificada).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  valorBonus: ").append(valorBonus).append("\n");
    sb.append("  numeroParcelas: ").append(numeroParcelas).append("\n");
    sb.append("  flagAdereAutomatico: ").append(flagAdereAutomatico).append("\n");
    sb.append("  flagGeraNumeroSorte: ").append(flagGeraNumeroSorte).append("\n");
    sb.append("  faixaEtaria: ").append(faixaEtaria).append("\n");
    sb.append("  flagSeguro: ").append(flagSeguro).append("\n");
    sb.append("  sorteiosMensais: ").append(sorteiosMensais).append("\n");
    sb.append("  flagAdesaoAutomatica: ").append(flagAdesaoAutomatica).append("\n");
    sb.append("  flagDependente: ").append(flagDependente).append("\n");
    sb.append("  quantidadeDependente: ").append(quantidadeDependente).append("\n");
    sb.append("  idTermoSeguroServico: ").append(idTermoSeguroServico).append("\n");
    sb.append("  idadeMinima: ").append(idadeMinima).append("\n");
    sb.append("  idadeMaxima: ").append(idadeMaxima).append("\n");
    sb.append("  flagDebitoIncondicional: ").append(flagDebitoIncondicional).append("\n");
    sb.append("  flagExtratoIncondicional: ").append(flagExtratoIncondicional).append("\n");
    sb.append("  flagEstornoAutomatico: ").append(flagEstornoAutomatico).append("\n");
    sb.append("  valorRepassadoSeguradora: ").append(valorRepassadoSeguradora).append("\n");
    sb.append("  flagLancaTransacao: ").append(flagLancaTransacao).append("\n");
    sb.append("  flagTransferenciaAutomatica: ").append(flagTransferenciaAutomatica).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idGrupoDebitoRecorrente: ").append(idGrupoDebitoRecorrente).append("\n");
    sb.append("  quantidadeTentativasCobranca: ").append(quantidadeTentativasCobranca).append("\n");
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
