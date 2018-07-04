package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{risco_fraude_detalhado_response_description}}}
 **/
@ApiModel(description = "{{{risco_fraude_detalhado_response_description}}}")
public class RiscoFraudeDetalhadoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoResolucao")
  private Long idTipoResolucao = null;
  @SerializedName("descricaoTipoResolucao")
  private String descricaoTipoResolucao = null;
  @SerializedName("flagAltoRisco")
  private Boolean flagAltoRisco = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idTransacao")
  private Long idTransacao = null;
  @SerializedName("dataTransacao")
  private String dataTransacao = null;
  @SerializedName("valorTransacao")
  private BigDecimal valorTransacao = null;
  @SerializedName("codigoMoedaOrigem")
  private String codigoMoedaOrigem = null;
  @SerializedName("valorOrigem")
  private BigDecimal valorOrigem = null;
  @SerializedName("codigoMoedaDestino")
  private String codigoMoedaDestino = null;
  @SerializedName("valorDestino")
  private BigDecimal valorDestino = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("idPais")
  private String idPais = null;
  @SerializedName("codigoRespostaAutorizador")
  private String codigoRespostaAutorizador = null;
  @SerializedName("descricaoRespostaAutorizador")
  private String descricaoRespostaAutorizador = null;
  @SerializedName("codigoRespostaFraude")
  private String codigoRespostaFraude = null;
  @SerializedName("descricaoRespostaFraude")
  private String descricaoRespostaFraude = null;
  @SerializedName("origemTransacao")
  private String origemTransacao = null;
  @SerializedName("codigoModoEntradaTerminal")
  private String codigoModoEntradaTerminal = null;
  @SerializedName("descricaoModoEntradaTerminal")
  private String descricaoModoEntradaTerminal = null;
  @SerializedName("cpf")
  private String cpf = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("telefones")
  private List<TelefoneResponse> telefones = null;

  
  /**
   * {{{risco_fraude_detalhado_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_id_tipo_resolucao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_tipo_resolucao_value}}}")
  public Long getIdTipoResolucao() {
    return idTipoResolucao;
  }
  public void setIdTipoResolucao(Long idTipoResolucao) {
    this.idTipoResolucao = idTipoResolucao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_descricao_tipo_resolucao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_descricao_tipo_resolucao_value}}}")
  public String getDescricaoTipoResolucao() {
    return descricaoTipoResolucao;
  }
  public void setDescricaoTipoResolucao(String descricaoTipoResolucao) {
    this.descricaoTipoResolucao = descricaoTipoResolucao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_flag_alto_risco_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_flag_alto_risco_value}}}")
  public Boolean getFlagAltoRisco() {
    return flagAltoRisco;
  }
  public void setFlagAltoRisco(Boolean flagAltoRisco) {
    this.flagAltoRisco = flagAltoRisco;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_id_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_transacao_value}}}")
  public Long getIdTransacao() {
    return idTransacao;
  }
  public void setIdTransacao(Long idTransacao) {
    this.idTransacao = idTransacao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_data_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_data_transacao_value}}}")
  public String getDataTransacao() {
    return dataTransacao;
  }
  public void setDataTransacao(String dataTransacao) {
    this.dataTransacao = dataTransacao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_valor_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_valor_transacao_value}}}")
  public BigDecimal getValorTransacao() {
    return valorTransacao;
  }
  public void setValorTransacao(BigDecimal valorTransacao) {
    this.valorTransacao = valorTransacao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_codigo_moeda_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_codigo_moeda_origem_value}}}")
  public String getCodigoMoedaOrigem() {
    return codigoMoedaOrigem;
  }
  public void setCodigoMoedaOrigem(String codigoMoedaOrigem) {
    this.codigoMoedaOrigem = codigoMoedaOrigem;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_valor_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_valor_origem_value}}}")
  public BigDecimal getValorOrigem() {
    return valorOrigem;
  }
  public void setValorOrigem(BigDecimal valorOrigem) {
    this.valorOrigem = valorOrigem;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_codigo_moeda_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_codigo_moeda_destino_value}}}")
  public String getCodigoMoedaDestino() {
    return codigoMoedaDestino;
  }
  public void setCodigoMoedaDestino(String codigoMoedaDestino) {
    this.codigoMoedaDestino = codigoMoedaDestino;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_valor_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_valor_destino_value}}}")
  public BigDecimal getValorDestino() {
    return valorDestino;
  }
  public void setValorDestino(BigDecimal valorDestino) {
    this.valorDestino = valorDestino;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_id_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_id_pais_value}}}")
  public String getIdPais() {
    return idPais;
  }
  public void setIdPais(String idPais) {
    this.idPais = idPais;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_codigo_resposta_autorizador_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_codigo_resposta_autorizador_value}}}")
  public String getCodigoRespostaAutorizador() {
    return codigoRespostaAutorizador;
  }
  public void setCodigoRespostaAutorizador(String codigoRespostaAutorizador) {
    this.codigoRespostaAutorizador = codigoRespostaAutorizador;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_descricao_resposta_autorizador_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_descricao_resposta_autorizador_value}}}")
  public String getDescricaoRespostaAutorizador() {
    return descricaoRespostaAutorizador;
  }
  public void setDescricaoRespostaAutorizador(String descricaoRespostaAutorizador) {
    this.descricaoRespostaAutorizador = descricaoRespostaAutorizador;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_codigo_resposta_fraude_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_codigo_resposta_fraude_value}}}")
  public String getCodigoRespostaFraude() {
    return codigoRespostaFraude;
  }
  public void setCodigoRespostaFraude(String codigoRespostaFraude) {
    this.codigoRespostaFraude = codigoRespostaFraude;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_descricao_resposta_fraude_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_descricao_resposta_fraude_value}}}")
  public String getDescricaoRespostaFraude() {
    return descricaoRespostaFraude;
  }
  public void setDescricaoRespostaFraude(String descricaoRespostaFraude) {
    this.descricaoRespostaFraude = descricaoRespostaFraude;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_origem_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_origem_transacao_value}}}")
  public String getOrigemTransacao() {
    return origemTransacao;
  }
  public void setOrigemTransacao(String origemTransacao) {
    this.origemTransacao = origemTransacao;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_codigo_modo_entrada_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_codigo_modo_entrada_terminal_value}}}")
  public String getCodigoModoEntradaTerminal() {
    return codigoModoEntradaTerminal;
  }
  public void setCodigoModoEntradaTerminal(String codigoModoEntradaTerminal) {
    this.codigoModoEntradaTerminal = codigoModoEntradaTerminal;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_descricao_modo_entrada_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_descricao_modo_entrada_terminal_value}}}")
  public String getDescricaoModoEntradaTerminal() {
    return descricaoModoEntradaTerminal;
  }
  public void setDescricaoModoEntradaTerminal(String descricaoModoEntradaTerminal) {
    this.descricaoModoEntradaTerminal = descricaoModoEntradaTerminal;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_cpf_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_cpf_value}}}")
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_cnpj_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_cnpj_value}}}")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_email_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{risco_fraude_detalhado_response_telefones_value}}}
   **/
  @ApiModelProperty(value = "{{{risco_fraude_detalhado_response_telefones_value}}}")
  public List<TelefoneResponse> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneResponse> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiscoFraudeDetalhadoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoResolucao: ").append(idTipoResolucao).append("\n");
    sb.append("  descricaoTipoResolucao: ").append(descricaoTipoResolucao).append("\n");
    sb.append("  flagAltoRisco: ").append(flagAltoRisco).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idTransacao: ").append(idTransacao).append("\n");
    sb.append("  dataTransacao: ").append(dataTransacao).append("\n");
    sb.append("  valorTransacao: ").append(valorTransacao).append("\n");
    sb.append("  codigoMoedaOrigem: ").append(codigoMoedaOrigem).append("\n");
    sb.append("  valorOrigem: ").append(valorOrigem).append("\n");
    sb.append("  codigoMoedaDestino: ").append(codigoMoedaDestino).append("\n");
    sb.append("  valorDestino: ").append(valorDestino).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  idPais: ").append(idPais).append("\n");
    sb.append("  codigoRespostaAutorizador: ").append(codigoRespostaAutorizador).append("\n");
    sb.append("  descricaoRespostaAutorizador: ").append(descricaoRespostaAutorizador).append("\n");
    sb.append("  codigoRespostaFraude: ").append(codigoRespostaFraude).append("\n");
    sb.append("  descricaoRespostaFraude: ").append(descricaoRespostaFraude).append("\n");
    sb.append("  origemTransacao: ").append(origemTransacao).append("\n");
    sb.append("  codigoModoEntradaTerminal: ").append(codigoModoEntradaTerminal).append("\n");
    sb.append("  descricaoModoEntradaTerminal: ").append(descricaoModoEntradaTerminal).append("\n");
    sb.append("  cpf: ").append(cpf).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


