package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ConsultaCadastroEstabelecimentoDTO;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{estabelecimento_response_description}}}
 **/
@ApiModel(description = "{{{estabelecimento_response_description}}}")
public class EstabelecimentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("numeroEstabelecimento")
  private String numeroEstabelecimento = null;
  @SerializedName("flagMatriz")
  private Integer flagMatriz = null;
  @SerializedName("idGrupoEconomico")
  private Long idGrupoEconomico = null;
  @SerializedName("numeroReceitaFederal")
  private Long numeroReceitaFederal = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("nomeFantasia")
  private String nomeFantasia = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private String numeroEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("complemento")
  private String complemento = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("cep2")
  private String cep2 = null;
  @SerializedName("nomeLogradouro2")
  private String nomeLogradouro2 = null;
  @SerializedName("numeroEndereco2")
  private String numeroEndereco2 = null;
  @SerializedName("bairro2")
  private String bairro2 = null;
  @SerializedName("cidade2")
  private String cidade2 = null;
  @SerializedName("complemento2")
  private String complemento2 = null;
  @SerializedName("uf2")
  private String uf2 = null;
  @SerializedName("obs")
  private String obs = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("flagArquivoSecrFazenda")
  private Integer flagArquivoSecrFazenda = null;
  @SerializedName("flagCartaoDigitado")
  private Integer flagCartaoDigitado = null;
  @SerializedName("inativo")
  private Integer inativo = null;
  @SerializedName("idMoeda")
  private Long idMoeda = null;
  @SerializedName("idPais")
  private Long idPais = null;
  @SerializedName("associadoSPCBrasil")
  private Integer associadoSPCBrasil = null;
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("idTipoEstabelecimento")
  private Long idTipoEstabelecimento = null;
  @SerializedName("correspondencia")
  private Integer correspondencia = null;
  @SerializedName("cargoContato")
  private String cargoContato = null;
  public enum TipoPagamentoEnum {
     CENTRALIZADO,  PV, 
  };
  @SerializedName("tipoPagamento")
  private TipoPagamentoEnum tipoPagamento = null;
  @SerializedName("consulta")
  private ConsultaCadastroEstabelecimentoDTO consulta = null;
  @SerializedName("consulta2")
  private ConsultaCadastroEstabelecimentoDTO consulta2 = null;
  @SerializedName("consulta3")
  private ConsultaCadastroEstabelecimentoDTO consulta3 = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("dataCadastramento")
  private String dataCadastramento = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * {{{estabelecimento_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{estabelecimento_response_numero_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_numero_estabelecimento_value}}}")
  public String getNumeroEstabelecimento() {
    return numeroEstabelecimento;
  }
  public void setNumeroEstabelecimento(String numeroEstabelecimento) {
    this.numeroEstabelecimento = numeroEstabelecimento;
  }

  
  /**
   * {{{estabelecimento_response_flag_matriz_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_flag_matriz_value}}}")
  public Integer getFlagMatriz() {
    return flagMatriz;
  }
  public void setFlagMatriz(Integer flagMatriz) {
    this.flagMatriz = flagMatriz;
  }

  
  /**
   * {{{estabelecimento_response_id_grupo_economico_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_id_grupo_economico_value}}}")
  public Long getIdGrupoEconomico() {
    return idGrupoEconomico;
  }
  public void setIdGrupoEconomico(Long idGrupoEconomico) {
    this.idGrupoEconomico = idGrupoEconomico;
  }

  
  /**
   * {{{estabelecimento_response_numero_receita_federal_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_numero_receita_federal_value}}}")
  public Long getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(Long numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * {{{estabelecimento_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{estabelecimento_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{estabelecimento_response_nome_fantasia_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_nome_fantasia_value}}}")
  public String getNomeFantasia() {
    return nomeFantasia;
  }
  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  
  /**
   * {{{estabelecimento_response_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{estabelecimento_response_nome_logradouro_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_nome_logradouro_value}}}")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * {{{estabelecimento_response_numero_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_numero_endereco_value}}}")
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{estabelecimento_response_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{estabelecimento_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{estabelecimento_response_complemento_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_complemento_value}}}")
  public String getComplemento() {
    return complemento;
  }
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  
  /**
   * {{{estabelecimento_response_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{estabelecimento_response_cep2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_cep2_value}}}")
  public String getCep2() {
    return cep2;
  }
  public void setCep2(String cep2) {
    this.cep2 = cep2;
  }

  
  /**
   * {{{estabelecimento_response_nome_logradouro2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_nome_logradouro2_value}}}")
  public String getNomeLogradouro2() {
    return nomeLogradouro2;
  }
  public void setNomeLogradouro2(String nomeLogradouro2) {
    this.nomeLogradouro2 = nomeLogradouro2;
  }

  
  /**
   * {{{estabelecimento_response_numero_endereco2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_numero_endereco2_value}}}")
  public String getNumeroEndereco2() {
    return numeroEndereco2;
  }
  public void setNumeroEndereco2(String numeroEndereco2) {
    this.numeroEndereco2 = numeroEndereco2;
  }

  
  /**
   * {{{estabelecimento_response_bairro2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_bairro2_value}}}")
  public String getBairro2() {
    return bairro2;
  }
  public void setBairro2(String bairro2) {
    this.bairro2 = bairro2;
  }

  
  /**
   * {{{estabelecimento_response_cidade2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_cidade2_value}}}")
  public String getCidade2() {
    return cidade2;
  }
  public void setCidade2(String cidade2) {
    this.cidade2 = cidade2;
  }

  
  /**
   * {{{estabelecimento_response_complemento2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_complemento2_value}}}")
  public String getComplemento2() {
    return complemento2;
  }
  public void setComplemento2(String complemento2) {
    this.complemento2 = complemento2;
  }

  
  /**
   * {{{estabelecimento_response_uf2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_uf2_value}}}")
  public String getUf2() {
    return uf2;
  }
  public void setUf2(String uf2) {
    this.uf2 = uf2;
  }

  
  /**
   * {{{estabelecimento_response_obs_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_obs_value}}}")
  public String getObs() {
    return obs;
  }
  public void setObs(String obs) {
    this.obs = obs;
  }

  
  /**
   * {{{estabelecimento_response_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_contato_value}}}")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * {{{estabelecimento_response_email_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{estabelecimento_response_flag_arquivo_secr_fazenda_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_flag_arquivo_secr_fazenda_value}}}")
  public Integer getFlagArquivoSecrFazenda() {
    return flagArquivoSecrFazenda;
  }
  public void setFlagArquivoSecrFazenda(Integer flagArquivoSecrFazenda) {
    this.flagArquivoSecrFazenda = flagArquivoSecrFazenda;
  }

  
  /**
   * {{{estabelecimento_response_flag_cartao_digitado_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_flag_cartao_digitado_value}}}")
  public Integer getFlagCartaoDigitado() {
    return flagCartaoDigitado;
  }
  public void setFlagCartaoDigitado(Integer flagCartaoDigitado) {
    this.flagCartaoDigitado = flagCartaoDigitado;
  }

  
  /**
   * {{{estabelecimento_response_inativo_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_inativo_value}}}")
  public Integer getInativo() {
    return inativo;
  }
  public void setInativo(Integer inativo) {
    this.inativo = inativo;
  }

  
  /**
   * {{{estabelecimento_response_id_moeda_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_id_moeda_value}}}")
  public Long getIdMoeda() {
    return idMoeda;
  }
  public void setIdMoeda(Long idMoeda) {
    this.idMoeda = idMoeda;
  }

  
  /**
   * {{{estabelecimento_response_id_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_id_pais_value}}}")
  public Long getIdPais() {
    return idPais;
  }
  public void setIdPais(Long idPais) {
    this.idPais = idPais;
  }

  
  /**
   * {{{estabelecimento_response_associado_s_p_c_brasil_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_associado_s_p_c_brasil_value}}}")
  public Integer getAssociadoSPCBrasil() {
    return associadoSPCBrasil;
  }
  public void setAssociadoSPCBrasil(Integer associadoSPCBrasil) {
    this.associadoSPCBrasil = associadoSPCBrasil;
  }

  
  /**
   * {{{estabelecimento_response_mcc_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_mcc_value}}}")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   * {{{estabelecimento_response_id_tipo_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_id_tipo_estabelecimento_value}}}")
  public Long getIdTipoEstabelecimento() {
    return idTipoEstabelecimento;
  }
  public void setIdTipoEstabelecimento(Long idTipoEstabelecimento) {
    this.idTipoEstabelecimento = idTipoEstabelecimento;
  }

  
  /**
   * {{{estabelecimento_response_correspondencia_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_correspondencia_value}}}")
  public Integer getCorrespondencia() {
    return correspondencia;
  }
  public void setCorrespondencia(Integer correspondencia) {
    this.correspondencia = correspondencia;
  }

  
  /**
   * {{{estabelecimento_response_cargo_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_cargo_contato_value}}}")
  public String getCargoContato() {
    return cargoContato;
  }
  public void setCargoContato(String cargoContato) {
    this.cargoContato = cargoContato;
  }

  
  /**
   * {{{estabelecimento_response_tipo_pagamento_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_tipo_pagamento_value}}}")
  public TipoPagamentoEnum getTipoPagamento() {
    return tipoPagamento;
  }
  public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
    this.tipoPagamento = tipoPagamento;
  }

  
  /**
   * {{{estabelecimento_response_consulta_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_consulta_value}}}")
  public ConsultaCadastroEstabelecimentoDTO getConsulta() {
    return consulta;
  }
  public void setConsulta(ConsultaCadastroEstabelecimentoDTO consulta) {
    this.consulta = consulta;
  }

  
  /**
   * {{{estabelecimento_response_consulta2_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_consulta2_value}}}")
  public ConsultaCadastroEstabelecimentoDTO getConsulta2() {
    return consulta2;
  }
  public void setConsulta2(ConsultaCadastroEstabelecimentoDTO consulta2) {
    this.consulta2 = consulta2;
  }

  
  /**
   * {{{estabelecimento_response_consulta3_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_consulta3_value}}}")
  public ConsultaCadastroEstabelecimentoDTO getConsulta3() {
    return consulta3;
  }
  public void setConsulta3(ConsultaCadastroEstabelecimentoDTO consulta3) {
    this.consulta3 = consulta3;
  }

  
  /**
   * {{{estabelecimento_response_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_terminal_value}}}")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * {{{estabelecimento_response_data_cadastramento_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_data_cadastramento_value}}}")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  
  /**
   * {{{estabelecimento_response_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{estabelecimento_response_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstabelecimentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numeroEstabelecimento: ").append(numeroEstabelecimento).append("\n");
    sb.append("  flagMatriz: ").append(flagMatriz).append("\n");
    sb.append("  idGrupoEconomico: ").append(idGrupoEconomico).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  nomeFantasia: ").append(nomeFantasia).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  complemento: ").append(complemento).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  cep2: ").append(cep2).append("\n");
    sb.append("  nomeLogradouro2: ").append(nomeLogradouro2).append("\n");
    sb.append("  numeroEndereco2: ").append(numeroEndereco2).append("\n");
    sb.append("  bairro2: ").append(bairro2).append("\n");
    sb.append("  cidade2: ").append(cidade2).append("\n");
    sb.append("  complemento2: ").append(complemento2).append("\n");
    sb.append("  uf2: ").append(uf2).append("\n");
    sb.append("  obs: ").append(obs).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  flagArquivoSecrFazenda: ").append(flagArquivoSecrFazenda).append("\n");
    sb.append("  flagCartaoDigitado: ").append(flagCartaoDigitado).append("\n");
    sb.append("  inativo: ").append(inativo).append("\n");
    sb.append("  idMoeda: ").append(idMoeda).append("\n");
    sb.append("  idPais: ").append(idPais).append("\n");
    sb.append("  associadoSPCBrasil: ").append(associadoSPCBrasil).append("\n");
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  idTipoEstabelecimento: ").append(idTipoEstabelecimento).append("\n");
    sb.append("  correspondencia: ").append(correspondencia).append("\n");
    sb.append("  cargoContato: ").append(cargoContato).append("\n");
    sb.append("  tipoPagamento: ").append(tipoPagamento).append("\n");
    sb.append("  consulta: ").append(consulta).append("\n");
    sb.append("  consulta2: ").append(consulta2).append("\n");
    sb.append("  consulta3: ").append(consulta3).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  dataCadastramento: ").append(dataCadastramento).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
