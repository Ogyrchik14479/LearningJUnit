import React, { Component } from "react";
import ReactDOM from "react-dom";
import InputMask from 'react-input-mask';
import '../scss/page.scss';
import '../scss/form/form.scss';


export class App extends Component {
    constructor() {
        super();
        this.state = {
            baseAvatar: 'data:image/png;base64,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',
            form: {
                uploadAvatarUri: '',
                avatarIsUploaded: false,
            }
        };
        this.state.form.uploadAvatarUri = this.state.baseAvatar;
    }

    uploadAvatar(ev) {
        var file = ev.target.files[0];
        var reader = new FileReader();
        reader.onloadend = () => {
            this.setState({
                avatarIsUploaded: true,
                form: {
                    uploadAvatarUri: reader.result,
                }
            });
        }
        reader.readAsDataURL(file);
    }

    sendForm(ev) {
        ev.preventDefault();


        fetch('/resume', {
            method: 'POST',
            mode: 'cors',
            cache: 'no-cache',
            credentials: 'same-origin',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(this.state.form)
        })
            .then(res => res.json())
            .then(body => {
                console.log(body);
            });
    }

    handleChange(obj, event) {
        const key = event.target.name;
        const value = event.target.value;

        this.setState({
            form: {
                [obj]: {
                    [key]: value
                }
            }
        });
    }

    render() {
        console.log(this.state);

        return (
            <div>
                <header>
                    <nav>
                    </nav>

                    <div className="title container">
                        <h1>Создать резюме на&nbsp;работу</h1>
                    </div>
                </header>

                <section className={"form-page container"}>
                    <form action="" onSubmit={this.sendForm.bind(this)}>
                        <div className="box-infos">
                            <div className="box-infos__left">
                                <label className="field">
                                    <input
                                        type="text"
                                        name={'lastName'}
                                        placeholder="Фамилия"
                                        onInput={this.handleChange.bind(this, 'basicInformation')}/>
                                    <span className={"field__placeholder"}>Фамилия</span>
                                </label>
                                <label className="field">
                                    <input
                                        type="text"
                                        name={'name'}
                                        placeholder="Имя"
                                        onInput={this.handleChange.bind(this, 'basicInformation')}/>
                                    <span className={"field__placeholder"}>Имя</span>
                                </label>
                                <label className="field">
                                    <input
                                        type="text"
                                        name={'secName'}
                                        placeholder="Отчество"
                                        onInput={this.handleChange.bind(this)}/>
                                    <span className={"field__placeholder"}>Отчество</span>
                                </label>
                            </div>
                            <div className="box-infos__right">
                                <label className="field">
                                    <input
                                        type="file" accept="image/jpeg,image/png"
                                        spellCheck="false"
                                        onInput={this.uploadAvatar.bind(this)}/>
                                    <img
                                        className={this.state.avatarIsUploaded ? '_uploaded' : ''}
                                        src={this.state.form.uploadAvatarUri}
                                        alt=""/>
                                </label>
                            </div>
                        </div>

                        <div className="box-infos">
                            <div className="box-infos_inline">
                                <label className="field">
                                    <InputMask
                                        mask="99.99.9999"
                                        type="text" name={'birthday'}
                                        placeholder="Дата рождения"
                                        onInput={this.handleChange.bind(this)}/>
                                    <span className={"field__placeholder"}>Дата рождения</span>
                                </label>
                                <label className="field">
                                    <InputMask
                                        mask="+7 999 999 9999"
                                        type="phone" name={'telephoneNumber'}
                                        placeholder="Номер телефона"
                                        onInput={this.handleChange.bind(this)}/>
                                    <span className={"field__placeholder"}>Номер телефона</span>
                                </label>
                                <label className="field">
                                    <InputMask
                                        type="email"
                                        name={'email'}
                                        placeholder="Email"
                                        onInput={this.handleChange.bind(this)}/>
                                    <span className={"field__placeholder"}>Email</span>
                                </label>
                            </div>
                        </div>

                        <div className="box-infos">
                            <div className="box-infos__title">Скиллы</div>
                            <div className="box-infos_block">
                                <label className="field">
                                    <input
                                        type="text"
                                        name={'languages'}
                                        placeholder="Языки"
                                        onInput={this.handleChange.bind(this)}/>
                                    <span className={"field__placeholder"}>Языки</span>
                                </label>
                            </div>
                        </div>

                        <input type="submit" value="Сгенерировать"/>
                    </form>
                </section>
            </div>
        );
    }
}

export default App;

ReactDOM.render(<App />, document.querySelector("#app"));